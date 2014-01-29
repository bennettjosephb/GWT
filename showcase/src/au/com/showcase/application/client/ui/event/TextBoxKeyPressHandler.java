package au.com.showcase.application.client.ui.event;

import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;

public class TextBoxKeyPressHandler implements KeyPressHandler {

	private Boolean hasError;

	public Boolean getHasError() {
		return hasError;
	}

	public void setHasError(Boolean hasError) {
		this.hasError = hasError;
	}

	@Inject
	public TextBoxKeyPressHandler() {
	}

	@Override
	public void onKeyPress(KeyPressEvent event) {

		TextBox textBox = (TextBox) event.getSource();

		if (textBox.getText() != null && textBox.getText().trim().equals("")) {
			if (textBox.getText().matches("[a-zA-Z0-9\\s]+")) {

				textBox.addStyleName("");

			} else {
				textBox.addStyleName("");
			}
		}

	}

}
