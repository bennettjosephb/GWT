package au.com.showcase.application.client.ui.event;

import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.user.client.ui.DecoratedPopupPanel;
import com.google.gwt.user.client.ui.HTML;
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

	private DecoratedPopupPanel decoratedPopupPanel;

	public DecoratedPopupPanel getDecoratedPopupPanel() {
		return decoratedPopupPanel;
	}

	public void setDecoratedPopupPanel(DecoratedPopupPanel decoratedPopupPanel) {
		this.decoratedPopupPanel = decoratedPopupPanel;
	}

	public TextBoxFocusHandler(DecoratedPopupPanel decoratedPopupPanel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

	}

	@Override
	public void onFocus(FocusEvent event) {

		TextBox textBox = ((TextBox) event.getSource());
		
		decoratedPopupPanel.setWidget(new HTML("THIS IS CONSTANT"));

		decoratedPopupPanel.setPopupPosition(textBox.getAbsoluteLeft() + 300,
				textBox.getAbsoluteTop());

		decoratedPopupPanel.show();

	}

}
