package au.com.showcase.application.client.ui.event;

import au.com.showcase.application.client.bundle.ApplicationResources;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.user.client.ui.DecoratedPopupPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.inject.Inject;

public class LocationListBoxBlurHandler implements BlurHandler {

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

	@Inject
	public LocationListBoxBlurHandler() {
		ApplicationResources.INSTANCE.customWidget().ensureInjected();
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

	public LocationListBoxBlurHandler(DecoratedPopupPanel decoratedPopupPanel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

	}

	public LocationListBoxBlurHandler(DecoratedPopupPanel decoratedPopupPanel,
			Label errorLabel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

		this.errorLabel = errorLabel;

	}

	@Override
	public void onBlur(BlurEvent event) {
		ListBox textBox = (ListBox) event.getSource();

		if (textBox.getSelectedIndex() == 0) {
			ApplicationResources.INSTANCE.customWidget().ensureInjected();
			container.addClassName(ApplicationResources.INSTANCE
					.registrationFormStyle().selectStyleError());
			setError(true);
			errorLabel.setVisible(true);
		} else {

		}
		decoratedPopupPanel.hide();
	}

}
