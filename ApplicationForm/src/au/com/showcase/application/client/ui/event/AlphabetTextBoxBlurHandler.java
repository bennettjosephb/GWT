package au.com.showcase.application.client.ui.event;

import au.com.showcase.application.client.bundle.ApplicationResources;
import au.com.showcase.application.client.bundle.DecoratedPopupPanel;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;

public class AlphabetTextBoxBlurHandler implements BlurHandler {

	private Boolean error;

	public Boolean isError() {
		return error;
	}

	public void setError(Boolean error) {
		this.error = error;
	}

	@Inject
	public AlphabetTextBoxBlurHandler() {
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

	public AlphabetTextBoxBlurHandler(DecoratedPopupPanel decoratedPopupPanel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

	}

	public AlphabetTextBoxBlurHandler(DecoratedPopupPanel decoratedPopupPanel,
			Label errorLabel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

		this.errorLabel = errorLabel;

	}

	@Override
	public void onBlur(BlurEvent event) {
		TextBox textBox = (TextBox) event.getSource();

		if (textBox.getText() != null && !textBox.getText().trim().equals("")) {
			if (!textBox.getText().matches("[a-zA-Z\\s]+")) {
				textBox.addStyleName(ApplicationResources.INSTANCE
						.registrationFormStyle().textboxFirstNameError());
				setError(true);
				errorLabel.setVisible(true);
			} else {
				textBox.removeStyleName(ApplicationResources.INSTANCE
						.registrationFormStyle().textboxFirstNameError());
				setError(false);
				errorLabel.setVisible(false);
			}
		} else if (textBox.getText() != null
				&& textBox.getText().trim().equals("")) {
			textBox.addStyleName(ApplicationResources.INSTANCE
					.registrationFormStyle().textboxFirstNameError());
			setError(true);
			errorLabel.setVisible(true);
		}
		decoratedPopupPanel.hide();
		//
		// // ApplicationResources.INSTANCE.customWidget().ensureInjected();
		// textBox.addStyleName(ApplicationResources.INSTANCE.customWidget()
		// .textboxFirstNameError());
		//
		// setHasError(true);
		//
		//
		// // Window.alert(textBox.getStyleName());
		//
	}
}
