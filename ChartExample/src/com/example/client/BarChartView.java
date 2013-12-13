package com.example.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class BarChartView extends ViewImpl implements BarChartPresenter.MyView {

	private final Widget widget;

	@UiField
	HTMLPanel chartPanel;

	public HTMLPanel getChartPanel() {
		return chartPanel;
	}

	public void setChartPanel(HTMLPanel chartPanel) {
		this.chartPanel = chartPanel;
	}

	public interface Binder extends UiBinder<Widget, BarChartView> {
	}

	@Inject
	public BarChartView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
