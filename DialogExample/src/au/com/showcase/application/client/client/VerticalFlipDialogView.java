package au.com.showcase.application.client.client;

import com.gwtplatform.mvp.client.PopupViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.event.shared.EventBus;
import com.google.inject.Inject;

public class VerticalFlipDialogView extends PopupViewImpl implements
		VerticalFlipDialogPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, VerticalFlipDialogView> {
	}

	@Inject
	public VerticalFlipDialogView(final EventBus eventBus, final Binder binder) {
		super(eventBus);
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
	
	@UiField
	PopupPanel container;

	public PopupPanel getContainer() {
		return container;
	}

	public void setContainer(PopupPanel container) {
		this.container = container;
	}
}
