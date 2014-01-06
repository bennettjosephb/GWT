package au.com.showcase.application.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class RadioButtonSampleView extends ViewImpl implements
		RadioButtonSamplePresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, RadioButtonSampleView> {
	}

	@Inject
	public RadioButtonSampleView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
