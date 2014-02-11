package au.com.showcase.application.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class CurrentTransactionView extends ViewImpl implements
		CurrentTransactionPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, CurrentTransactionView> {
	}

	@Inject
	public CurrentTransactionView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
