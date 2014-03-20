package a.b.c.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class TreeSampleView extends ViewImpl implements
		TreeSamplePresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, TreeSampleView> {
	}

	@Inject
	public TreeSampleView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	DivElement chartLayout;

	public DivElement getChartLayout() {
		return chartLayout;
	}

	public void setChartLayout(DivElement chartLayout) {
		this.chartLayout = chartLayout;
	}

}
