package au.com.showcase.application.client.ui.event;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;

public class TextBoxClickHandler implements ClickHandler {

	@Inject
	public TextBoxClickHandler() {
	}

	@Override
	public void onClick(ClickEvent event) {
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
