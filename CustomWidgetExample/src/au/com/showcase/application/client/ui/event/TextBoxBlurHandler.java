package au.com.showcase.application.client.ui.event;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.inject.Inject;

public class TextBoxBlurHandler implements BlurHandler {

	@Inject
	public TextBoxBlurHandler() {
	}

	@Override
	public void onBlur(BlurEvent event) {
		event.getSource();
	}
}
