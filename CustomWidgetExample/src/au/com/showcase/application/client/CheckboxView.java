package au.com.showcase.application.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class CheckboxView extends ViewImpl implements CheckboxPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, CheckboxView> {
	}

	@Inject
	public CheckboxView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
