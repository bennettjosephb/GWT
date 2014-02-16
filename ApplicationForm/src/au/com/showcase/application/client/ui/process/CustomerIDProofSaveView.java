package au.com.showcase.application.client.ui.process;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class CustomerIDProofSaveView extends ViewImpl implements
		CustomerIDProofSavePresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, CustomerIDProofSaveView> {
	}

	@Inject
	public CustomerIDProofSaveView(final Binder binder) {
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

	@UiField
	Button back;

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

	public Button getBack() {
		return back;
	}

	public void setBack(Button back) {
		this.back = back;
	}
}
