package com.example.client;

import com.example.client.place.NameTokens;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.visualization.client.AbstractDataTable;
import com.google.gwt.visualization.client.AbstractDataTable.ColumnType;
import com.google.gwt.visualization.client.DataTable;
import com.google.gwt.visualization.client.VisualizationUtils;
import com.google.gwt.visualization.client.visualizations.PieChart;
import com.google.gwt.visualization.client.visualizations.PieChart.Options;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class PieChartPresenter extends
		Presenter<PieChartPresenter.MyView, PieChartPresenter.MyProxy> {

	public interface MyView extends View {

		public HTMLPanel getChartPanel();

		public void setChartPanel(HTMLPanel chartPanel);
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.piechart)
	public interface MyProxy extends ProxyPlace<PieChartPresenter> {
	}

	@Inject
	public PieChartPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
	}

	@Override
	protected void onBind() {
		super.onBind();

		Runnable onLoadCallback = new Runnable() {

			@Override
			public void run() {
				PieChart pieChart = new PieChart(createTable(), createOptions());
				/* Panel panel = RootPanel.get(); */
				/* panel.add(pieChart); */
				Panel panel = getView().getChartPanel();
				panel.add(pieChart);
			}

			private AbstractDataTable createTable() {
				DataTable data = DataTable.create();
				data.addColumn(ColumnType.STRING, "Task");
				data.addColumn(ColumnType.NUMBER, "Hours per Day");
				data.addRows(2);
				data.setValue(0, 0, "Work");
				data.setValue(0, 1, 14);
				data.setValue(1, 0, "Sleep");
				data.setValue(1, 1, 10);
				return data;
			}

			private Options createOptions() {
				Options options = Options.create();
				options.setWidth(400);
				options.setHeight(240);
				options.setTitle("My Daily Activities");
				return options;

			}

		};

		VisualizationUtils.loadVisualizationApi(onLoadCallback,
				PieChart.PACKAGE);

	}

	@Override
	protected void onHide() {
		super.onHide();
	}

	@Override
	protected void onReset() {
		super.onReset();
	}

	@Override
	protected void onReveal() {
		super.onReveal();
	}

	@Override
	protected void onUnbind() {
		super.onUnbind();
	}
}
