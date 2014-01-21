package au.com.showcase.application.client.ui.event;

import au.com.showcase.application.client.bundle.ApplicationResources;
import au.com.showcase.application.client.bundle.DecoratedPopupPanel;

import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;

public class PasswordTextBoxFocusHandler implements FocusHandler {

	private Boolean error;

	public Boolean isError() {
		return error;
	}

	public void setHasError(Boolean error) {
		this.error = error;
	}

	@Inject
	public PasswordTextBoxFocusHandler() {
		ApplicationResources.INSTANCE.registrationFormStyle().ensureInjected();
	}

	private DecoratedPopupPanel decoratedPopupPanel;

	private Label errorLabel;

	public Label getErrorLabel() {
		return errorLabel;
	}

	public void setErrorLabel(Label errorLabel) {
		this.errorLabel = errorLabel;
	}

	public DecoratedPopupPanel getDecoratedPopupPanel() {
		return decoratedPopupPanel;
	}

	public void setDecoratedPopupPanel(DecoratedPopupPanel decoratedPopupPanel) {
		this.decoratedPopupPanel = decoratedPopupPanel;
	}

	public PasswordTextBoxFocusHandler(DecoratedPopupPanel decoratedPopupPanel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

	}

	public PasswordTextBoxFocusHandler(DecoratedPopupPanel decoratedPopupPanel,
			Label errorLabel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

		this.errorLabel = errorLabel;

	}

	public static Boolean FOCUSED = false;

	@Override
	public void onFocus(FocusEvent event) {

		FOCUSED = true;

		TextBox textBox = ((TextBox) event.getSource());

		textBox.removeStyleName(ApplicationResources.INSTANCE
				.registrationFormStyle().textboxFirstNameError());

		decoratedPopupPanel
				.setWidget(new HTML(decoratedPopupPanel.getMessage()));

		decoratedPopupPanel.setPopupPosition(textBox.getAbsoluteLeft()
				- decoratedPopupPanel.getLeft(), textBox.getAbsoluteTop()
				- decoratedPopupPanel.getTop());

		decoratedPopupPanel.show();

		errorLabel.setVisible(false);

	}

}
