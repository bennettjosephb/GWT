package au.com.example.gwt.client.widget;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class CustomizedTextboxView extends ViewImpl implements
		CustomizedTextboxPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, CustomizedTextboxView> {
	}

	@Inject
	public CustomizedTextboxView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
