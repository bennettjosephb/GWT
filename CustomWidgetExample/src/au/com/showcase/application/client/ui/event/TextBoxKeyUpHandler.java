package au.com.showcase.application.client.ui.event;

import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.ui.TextBox;

public class TextBoxKeyUpHandler implements KeyUpHandler {

	private Boolean hasError;

	public Boolean getHasError() {
		return hasError;
	}

	public void setHasError(Boolean hasError) {
		this.hasError = hasError;
	}

	@Override
	public void onKeyUp(KeyUpEvent event) {
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
