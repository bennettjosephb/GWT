package au.com.showcase.application.client.ui.event;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.user.client.ui.DecoratedPopupPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.TextBox;
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

	private DecoratedPopupPanel decoratedPopupPanel;

	public DecoratedPopupPanel getDecoratedPopupPanel() {
		return decoratedPopupPanel;
	}

	public void setDecoratedPopupPanel(DecoratedPopupPanel decoratedPopupPanel) {
		this.decoratedPopupPanel = decoratedPopupPanel;
	}

	public TextBoxBlurHandler(DecoratedPopupPanel decoratedPopupPanel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

	}

	@Override
	public void onBlur(BlurEvent event) {
		TextBox textBox = (TextBox) event.getSource();

		decoratedPopupPanel.setWidget(new HTML("THIS IS WORKING"));

		decoratedPopupPanel.setPopupPosition(textBox.getAbsoluteLeft() + 300,
				textBox.getAbsoluteTop());

		decoratedPopupPanel.hide();

	}
}
