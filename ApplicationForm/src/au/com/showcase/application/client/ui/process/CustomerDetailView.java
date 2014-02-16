package au.com.showcase.application.client.ui.process;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class CustomerDetailView extends ViewImpl implements
		CustomerDetailPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, CustomerDetailView> {
	}

	@Inject
	public CustomerDetailView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	Button next;
	@UiField
	Button cancel;

	public Button getNext() {
		return next;
	}

	public void setNext(Button next) {
		this.next = next;
	}

	public Button getCancel() {
		return cancel;
	}

	public void setCancel(Button cancel) {
		this.cancel = cancel;
	}
}
