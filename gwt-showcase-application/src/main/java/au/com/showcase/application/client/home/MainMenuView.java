package au.com.showcase.application.client.home;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class MainMenuView extends ViewImpl implements MainMenuPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, MainMenuView> {
	}

	@Inject
	public MainMenuView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	public Widget asWidget() {
		return widget;
	}
}
