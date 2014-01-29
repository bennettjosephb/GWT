package au.com.showcase.application.client.login;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class SignInPageView extends ViewImpl implements
		SignInPagePresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, SignInPageView> {
	}

	@Inject
	public SignInPageView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
