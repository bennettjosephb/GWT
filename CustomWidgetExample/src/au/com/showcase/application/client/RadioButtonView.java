package au.com.showcase.application.client;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.user.client.ui.FlowPanel;

public class RadioButtonView extends ViewImpl implements
		RadioButtonPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, RadioButtonView> {
	}

	@Inject
	public RadioButtonView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	Button button;
	
	@UiField
	FlowPanel container;

	public FlowPanel getContainer() {
		return container;
	}

	public void setContainer(FlowPanel container) {
		this.container = container;
	}

	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}
}
