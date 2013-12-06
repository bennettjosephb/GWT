package au.com.example.gwt.client.home;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class WelcomeView extends ViewImpl implements WelcomePresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, WelcomeView> {
	}

	@Inject
	public WelcomeView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
