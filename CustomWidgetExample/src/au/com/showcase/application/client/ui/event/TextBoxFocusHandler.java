package au.com.showcase.application.client.ui.event;

import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;

public class TextBoxFocusHandler implements FocusHandler {

	private Boolean hasError;

	public Boolean getHasError() {
		return hasError;
	}

	public void setHasError(Boolean hasError) {
		this.hasError = hasError;
	}

	@Inject
	public TextBoxFocusHandler() {
	}

	@Override
	public void onFocus(FocusEvent event) {

		((TextBox) event.getSource()).getText();

	}

}
