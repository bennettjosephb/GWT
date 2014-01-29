package au.com.showcase.application.client.ui.event;

import au.com.showcase.application.client.bundle.ApplicationResources;
import au.com.showcase.application.client.bundle.DecoratedPopupPanel;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;

public class PasswordTextBoxBlurHandler implements BlurHandler {

	@Inject
	public PasswordTextBoxBlurHandler() {
		ApplicationResources.INSTANCE.registrationFormStyle().ensureInjected();
	}

	private DecoratedPopupPanel decoratedPopupPanel;

	private Label errorLabel;

	private Boolean error;

	private PasswordTextBox dependentPassword;

	public PasswordTextBox getDependentPassword() {
		return dependentPassword;
	}

	public void setDependentPassword(PasswordTextBox dependentPassword) {
		this.dependentPassword = dependentPassword;
	}

	public Boolean isError() {
		return error;
	}

	public void setError(Boolean error) {
		this.error = error;
	}

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

	public PasswordTextBoxBlurHandler(DecoratedPopupPanel decoratedPopupPanel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

	}

	public PasswordTextBoxBlurHandler(DecoratedPopupPanel decoratedPopupPanel,
			Label errorLabel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

		this.errorLabel = errorLabel;

	}

	@Override
	public void onBlur(BlurEvent event) {
		TextBox textBox = (TextBox) event.getSource();

		if (textBox.getText() == null || textBox.getText().trim().equals("")) {
			textBox.addStyleName(ApplicationResources.INSTANCE
					.registrationFormStyle().textboxFirstNameError());
			setError(true);
			errorLabel.setVisible(true);
		} else {
			setError(false);
			errorLabel.setVisible(false);
		}
		decoratedPopupPanel.hide();
	}
}
