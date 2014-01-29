package au.com.showcase.application.client.ui.event;

import au.com.showcase.application.client.bundle.ApplicationResources;
import au.com.showcase.application.client.bundle.DecoratedPopupPanel;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.TextBox;

public class TextBoxFocusAndBlurHandler implements BlurHandler, FocusHandler {

	private Boolean hasError;

	private DecoratedPopupPanel decoratedPopupPanel;

	public DecoratedPopupPanel getDecoratedPopupPanel() {
		return decoratedPopupPanel;
	}

	public void setDecoratedPopupPanel(DecoratedPopupPanel decoratedPopupPanel) {
		this.decoratedPopupPanel = decoratedPopupPanel;
	}

	public TextBoxFocusAndBlurHandler() {

	}

	public TextBoxFocusAndBlurHandler(DecoratedPopupPanel decoratedPopupPanel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

	}

	public Boolean getHasError() {
		return hasError;
	}

	public void setHasError(Boolean hasError) {
		this.hasError = hasError;
	}

	@Override
	public void onBlur(BlurEvent event) {

		decoratedPopupPanel.hide();

	}

	@Override
	public void onFocus(FocusEvent event) {

		TextBox textBox = (TextBox) event.getSource();

		decoratedPopupPanel.setStyleName("errorInfoBubble");

		decoratedPopupPanel.setWidget(new HTML(decoratedPopupPanel.getMessage()
				+ ApplicationResources.INSTANCE.registrationFormStyle()
						.errorInfoBubble()));

		decoratedPopupPanel.setPopupPosition(textBox.getAbsoluteLeft()
				- decoratedPopupPanel.getLeft(), textBox.getAbsoluteTop()
				- decoratedPopupPanel.getTop());

		decoratedPopupPanel.show();

	}

}
