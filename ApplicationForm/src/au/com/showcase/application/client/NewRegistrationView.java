package au.com.showcase.application.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class NewRegistrationView extends ViewImpl implements
		NewRegistrationPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, NewRegistrationView> {
	}

	@Inject
	public NewRegistrationView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
