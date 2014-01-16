package au.com.showcase.application.client.scroll;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class ScrollTestView extends ViewImpl implements
		ScrollTestPresenter.MyView {

	private final Widget widget;

public interface Binder extends UiBinder<Widget, ScrollTestView> {
	}

	@Inject
	public ScrollTestView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}


	@Override
	public Widget asWidget() {
		return widget;
	}
}
