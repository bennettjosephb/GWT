package au.com.showcase.application.client.ui.event;

import au.com.showcase.application.client.bundle.ApplicationResources;
import au.com.showcase.application.client.bundle.DecoratedPopupPanel;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;

public class EmailAddressTextBoxBlurHandler implements BlurHandler {

	private Boolean error;

	public Boolean isError() {
		return error;
	}

	public void setError(Boolean error) {
		this.error = error;
	}

	@Inject
	public EmailAddressTextBoxBlurHandler() {
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

	public EmailAddressTextBoxBlurHandler(DecoratedPopupPanel decoratedPopupPanel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

	}

	public EmailAddressTextBoxBlurHandler(DecoratedPopupPanel decoratedPopupPanel,
			Label errorLabel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

		this.errorLabel = errorLabel;

	}

	@Override
	public void onBlur(BlurEvent event) {
		TextBox textBox = (TextBox) event.getSource();

		// decoratedPopupPanel.setWidget(new HTML("THIS IS WORKING"));

		// decoratedPopupPanel.setPopupPosition(textBox.getAbsoluteLeft() + 300,
		// textBox.getAbsoluteTop());

		decoratedPopupPanel.hide();

		// Window.alert("" +
		// ApplicationResources.INSTANCE.customWidget().textboxFirstNameError());
		ApplicationResources.INSTANCE.registrationFormStyle().ensureInjected();
		textBox.addStyleName(ApplicationResources.INSTANCE
				.registrationFormStyle().textboxFirstNameError());

		setError(true);

		errorLabel.setVisible(true);

		// Window.alert(textBox.getStyleName());

	}
}
