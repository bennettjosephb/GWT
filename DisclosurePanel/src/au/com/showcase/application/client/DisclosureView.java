package au.com.showcase.application.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class DisclosureView extends ViewImpl implements
		DisclosurePresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, DisclosureView> {
	}

	@Inject
	public DisclosureView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
