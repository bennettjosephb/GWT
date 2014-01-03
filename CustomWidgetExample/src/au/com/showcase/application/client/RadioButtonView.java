package au.com.showcase.application.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class RadioButtonView extends ViewImpl implements
		RadioButtonPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, RadioButtonView> {
	}

	@Inject
	public RadioButtonView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
