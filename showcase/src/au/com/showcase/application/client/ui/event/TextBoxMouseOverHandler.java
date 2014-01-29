package au.com.showcase.application.client.ui.event;

import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.Window;
import com.google.inject.Inject;

public class TextBoxMouseOverHandler implements MouseOverHandler {

	private Boolean hasError;

	public Boolean getHasError() {
		return hasError;
	}

	public void setHasError(Boolean hasError) {
		this.hasError = hasError;
	}

	@Inject
	public TextBoxMouseOverHandler() {
	}

	@Override
	public void onMouseOver(MouseOverEvent event) {
		//Window.alert("XAY");
	}

}
