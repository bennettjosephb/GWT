package au.com.showcase.application.client.ui.event;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.inject.Inject;

public class TextBoxBlurHandler implements BlurHandler {

	private Boolean hasError;

	public Boolean getHasError() {
		return hasError;
	}

	public void setHasError(Boolean hasError) {
		this.hasError = hasError;
	}

	@Inject
	public TextBoxBlurHandler() {
	}

	@Override
	public void onBlur(BlurEvent event) {
		event.getSource();
	}
}
