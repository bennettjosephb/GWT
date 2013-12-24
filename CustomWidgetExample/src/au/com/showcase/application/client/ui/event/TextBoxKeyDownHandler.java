package au.com.showcase.application.client.ui.event;

import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;

public class TextBoxKeyDownHandler implements KeyDownHandler {

	private Boolean hasError;

	public Boolean getHasError() {
		return hasError;
	}

	public void setHasError(Boolean hasError) {
		this.hasError = hasError;
	}

	@Inject
	public TextBoxKeyDownHandler() {
	}

	@Override
	public void onKeyDown(KeyDownEvent event) {
		
		((TextBox)event.getSource()).getSelectedText();

	}

}
