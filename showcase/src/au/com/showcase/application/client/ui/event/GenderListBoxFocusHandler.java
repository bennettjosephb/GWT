package au.com.showcase.application.client.ui.event;

import au.com.showcase.application.client.bundle.ApplicationResources;
import au.com.showcase.application.client.bundle.DecoratedPopupPanel;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;

public class GenderListBoxFocusHandler implements FocusHandler {

	private Boolean error;

	public Boolean isError() {
		return error;
	}

	public void setError(Boolean error) {
		this.error = error;
	}

	private DivElement container;

	public DivElement getContainer() {
		return container;
	}

	public void setContainer(DivElement container) {
		this.container = container;
	}

	private DecoratedPopupPanel decoratedPopupPanel;

	private Label errorLabel;

	public Label getErrorLabel() {
		return errorLabel;
	}

	public void setErrorLabel(Label errorLabel) {
		this.errorLabel = errorLabel;
	}

	public DecoratedPopupPanel getDecoratedPopupPanel() {
		return decoratedPopupPanel;
	}

	public void setDecoratedPopupPanel(DecoratedPopupPanel decoratedPopupPanel) {
		this.decoratedPopupPanel = decoratedPopupPanel;
	}

	public GenderListBoxFocusHandler() {

	}

	public GenderListBoxFocusHandler(DecoratedPopupPanel decoratedPopupPanel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

	}

	public GenderListBoxFocusHandler(DecoratedPopupPanel decoratedPopupPanel,
			Label errorLabel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

		this.errorLabel = errorLabel;

	}

	@Override
	public void onFocus(FocusEvent event) {
		ListBox textBox = (ListBox) event.getSource();

		decoratedPopupPanel
				.setWidget(new HTML(decoratedPopupPanel.getMessage()));

		// decoratedPopupPanel.setPopupPosition(textBox.getAbsoluteLeft() + 300,
		// textBox.getAbsoluteTop());

		decoratedPopupPanel.setPopupPosition(textBox.getAbsoluteLeft()
				- decoratedPopupPanel.getLeft(), textBox.getAbsoluteTop()
				- decoratedPopupPanel.getTop());

		decoratedPopupPanel.show();

		// Window.alert("" +
		// ApplicationResources.INSTANCE.customWidget().textboxFirstNameError());
		ApplicationResources.INSTANCE.registrationFormStyle().ensureInjected();
		// textBox.removeStyleName(ApplicationResources.INSTANCE.registrationFormStyle()
		// .selectStyleError());
		container.removeClassName(ApplicationResources.INSTANCE
				.registrationFormStyle().selectStyleError());

		setError(true);

		errorLabel.setVisible(false);

		// Window.alert(textBox.getStyleName());

	}

}