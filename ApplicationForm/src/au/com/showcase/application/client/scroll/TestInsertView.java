package au.com.showcase.application.client.scroll;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class TestInsertView extends ViewImpl implements
		TestInsertPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, TestInsertView> {
	}

	@Inject
	public TestInsertView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
