package com.example.client;

import com.example.client.place.NameTokens;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.visualization.client.AbstractDataTable;
import com.google.gwt.visualization.client.AbstractDataTable.ColumnType;
import com.google.gwt.visualization.client.DataTable;
import com.google.gwt.visualization.client.VisualizationUtils;
import com.google.gwt.visualization.client.visualizations.corechart.Options;
import com.google.gwt.visualization.client.visualizations.corechart.PieChart;
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
				data.addRows(16);
				data.setValue(0, 0, "Work");
				data.setValue(0, 1, 14);
				data.setValue(1, 0, "Sleep");
				data.setValue(1, 1, 10);
				data.setValue(2, 0, "Sleep1");
				data.setValue(2, 1, 10);
				data.setValue(3, 0, "Sleep1");
				data.setValue(3, 1, 10);
				data.setValue(4, 0, "Sleep1");
				data.setValue(4, 1, 10);
				data.setValue(5, 0, "Sleep1");
				data.setValue(5, 1, 10);
				data.setValue(6, 0, "Sleep1");
				data.setValue(6, 1, 10);
				data.setValue(7, 0, "Sleep1");
				data.setValue(7, 1, 10);
				data.setValue(8, 0, "Sleep1");
				data.setValue(8, 1, 10);
				data.setValue(9, 0, "Sleep1");
				data.setValue(9, 1, 10);
				data.setValue(10, 0, "Sleep1");
				data.setValue(10, 1, 10);
				data.setValue(11, 0, "Sleep1");
				data.setValue(11, 1, 10);
				data.setValue(12, 0, "Sleep1");
				data.setValue(12, 1, 10);
				data.setValue(13, 0, "Sleep1");
				data.setValue(13, 1, 10);
				data.setValue(14, 0, "Sleep1");
				data.setValue(14, 1, 10);
				data.setValue(15, 0, "Sleep1");
				data.setValue(15, 1, 10);
				return data;
			}

			private Options createOptions() {
				Options options = Options.create();
				options.setWidth(800);
				options.setHeight(480);
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
