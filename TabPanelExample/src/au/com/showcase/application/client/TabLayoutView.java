package au.com.showcase.application.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class TabLayoutView extends ViewImpl implements
		TabLayoutPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, TabLayoutView> {
	}

	@Inject
	public TabLayoutView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
