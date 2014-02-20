package au.com.showcase.application.client.ui.process;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class DealReceiptView extends ViewImpl implements
		DealReceiptPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, DealReceiptView> {
	}

	@Inject
	public DealReceiptView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	Button finish;

	public Button getFinish() {
		return finish;
	}

	public void setFinish(Button finish) {
		this.finish = finish;
	}

}
