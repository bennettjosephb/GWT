package au.com.showcase.application.client.ui.event;

import au.com.showcase.application.client.bundle.ApplicationResources;
import au.com.showcase.application.client.bundle.DecoratedPopupPanel;

import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
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

		decoratedPopupPanel.setStyleName(ApplicationResources.INSTANCE
				.customWidget().errorInfoBubble());

		decoratedPopupPanel.setWidget(new HTML(decoratedPopupPanel.getMessage()
				+ ApplicationResources.INSTANCE.customWidget()
						.errorInfoBubble()));

		decoratedPopupPanel.setPopupPosition(textBox.getAbsoluteLeft()
				- decoratedPopupPanel.getLeft(), textBox.getAbsoluteTop()
				- decoratedPopupPanel.getTop());

		decoratedPopupPanel.show();

	}

}
