package au.com.showcase.application.client.ui.event;

import au.com.showcase.application.client.bundle.ApplicationResources;
import au.com.showcase.application.client.bundle.DecoratedPopupPanel;

import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;

public class AlphabetTextBoxFocusHandler implements FocusHandler {

	private Boolean hasError = false;

	public Boolean getHasError() {
		return hasError;
	}

	public void setHasError(Boolean hasError) {
		this.hasError = hasError;
	}

	@Inject
	public AlphabetTextBoxFocusHandler() {
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

	public AlphabetTextBoxFocusHandler(DecoratedPopupPanel decoratedPopupPanel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

	}

	public AlphabetTextBoxFocusHandler(DecoratedPopupPanel decoratedPopupPanel,
			Label errorLabel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

		this.errorLabel = errorLabel;

	}

	@Override
	public void onFocus(FocusEvent event) {

		TextBox textBox = ((TextBox) event.getSource());

		decoratedPopupPanel.setStyleName(ApplicationResources.INSTANCE
				.registrationFormStyle().errorInfoBubble());

		decoratedPopupPanel
				.setWidget(new HTML(decoratedPopupPanel.getMessage()));

		decoratedPopupPanel.setPopupPosition(textBox.getAbsoluteLeft()
				- decoratedPopupPanel.getLeft(), textBox.getAbsoluteTop()
				- decoratedPopupPanel.getTop());

		decoratedPopupPanel.show();

		textBox.removeStyleName(ApplicationResources.INSTANCE
				.registrationFormStyle().textboxFirstNameError());

		if (errorLabel.isVisible()) {
			errorLabel.setVisible(true);
		} else if (!errorLabel.isVisible()) {
			errorLabel.setVisible(false);
		}
	}
}
