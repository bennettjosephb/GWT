package au.com.showcase.application.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class DatePickerView extends ViewImpl implements
		DatePickerPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, DatePickerView> {
	}

	@Inject
	public DatePickerView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
