package au.com.showcase.application.client.ui.process;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class ProcessSummaryView extends ViewImpl implements
		ProcessSummaryPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, ProcessSummaryView> {
	}

	@Inject
	public ProcessSummaryView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
