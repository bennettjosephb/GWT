package au.com.showcase.application.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;

public class TimeLineGroupView extends ViewImpl implements
		TimeLineGroupPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, TimeLineGroupView> {
	}

	@Inject
	public TimeLineGroupView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	HTMLPanel container;

	public HTMLPanel getContainer() {
		return container;
	}

	public void setContainer(HTMLPanel container) {
		this.container = container;
	}
}
