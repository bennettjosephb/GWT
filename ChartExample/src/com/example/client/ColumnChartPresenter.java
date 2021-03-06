package com.example.client;

import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.example.client.place.NameTokens;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.google.inject.Inject;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.visualization.client.AbstractDataTable;
import com.google.gwt.visualization.client.DataTable;
import com.google.gwt.visualization.client.VisualizationUtils;
import com.google.gwt.visualization.client.AbstractDataTable.ColumnType;
import com.google.gwt.visualization.client.visualizations.corechart.ColumnChart;
import com.google.gwt.visualization.client.visualizations.corechart.Options;
import com.google.gwt.visualization.client.visualizations.corechart.PieChart;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class ColumnChartPresenter extends
		Presenter<ColumnChartPresenter.MyView, ColumnChartPresenter.MyProxy> {

	public interface MyView extends View {
		
		public HTMLPanel getChartPanel();

		public void setChartPanel(HTMLPanel chartPanel);
		
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.columnchart)
	public interface MyProxy extends ProxyPlace<ColumnChartPresenter> {
	}

	@Inject
	public ColumnChartPresenter(final EventBus eventBus, final MyView view,
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
				ColumnChart pieChart = new ColumnChart(createTable(), createOptions());
				/* Panel panel = RootPanel.get(); */
				/* panel.add(pieChart); */
				Panel panel = getView().getChartPanel();
				panel.add(pieChart);
			}

			private AbstractDataTable createTable() {
				DataTable data = DataTable.create();
				data.addColumn(ColumnType.STRING, "Task");
				data.addColumn(ColumnType.NUMBER, "Hours per Day");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addColumn(ColumnType.NUMBER, "Something");
				data.addRows(1);
				data.setValue(0, 0, "Work");
				data.setValue(0, 1, 14);
				data.setValue(0, 2, 15);
				data.setValue(0, 3, 152);
				data.setValue(0, 4, 151);
				data.setValue(0, 5, 158);
				data.setValue(0, 6, 15);
				data.setValue(0, 7, 152);
				data.setValue(0, 8, 151);
				data.setValue(0, 9, 158);
				data.setValue(0, 10, 15);
				data.setValue(0, 11, 152);
				data.setValue(0, 12, 151);
				data.setValue(0, 13, 158);
				data.setValue(0, 14, 15);
				data.setValue(0, 15, 152);
				data.setValue(0, 16, 151);
				data.setValue(0, 17, 158);
				data.setValue(0, 18, 15);
				data.setValue(0, 19, 152);
				data.setValue(0, 20, 151);
				data.setValue(0, 21, 158);
				data.setValue(0, 22, 15);
				data.setValue(0, 23, 152);
				data.setValue(0, 24, 151);
				data.setValue(0, 25, 158);
//				data.setValue(1, 0, "Sleep");
//				data.setValue(1, 1, 10);
//				data.setValue(2, 0, "Sleep1");
//				data.setValue(2, 1, 10);
//				data.setValue(3, 0, "Sleep1");
//				data.setValue(3, 1, 10);
//				data.setValue(4, 0, "Sleep1");
//				data.setValue(4, 1, 10);
//				data.setValue(5, 0, "Sleep1");
//				data.setValue(5, 1, 10);
//				data.setValue(6, 0, "Sleep1");
//				data.setValue(6, 1, 10);
//				data.setValue(7, 0, "Sleep1");
//				data.setValue(7, 1, 10);
//				data.setValue(8, 0, "Sleep1");
//				data.setValue(8, 1, 10);
//				data.setValue(9, 0, "Sleep1");
//				data.setValue(9, 1, 10);
//				data.setValue(10, 0, "Sleep1");
//				data.setValue(10, 1, 10);
//				data.setValue(11, 0, "Sleep1");
//				data.setValue(11, 1, 10);
//				data.setValue(12, 0, "Sleep1");
//				data.setValue(12, 1, 10);
//				data.setValue(13, 0, "Sleep1");
//				data.setValue(13, 1, 10);
//				data.setValue(14, 0, "Sleep1");
//				data.setValue(14, 1, 10);
//				data.setValue(14, 0, "Sleep1");
//				data.setValue(14, 1, 10);
//				data.setValue(15, 0, "Sleep1");
//				data.setValue(15, 1, 10);
				return data;
			}

			private Options createOptionsChart() {
			    Options options = Options.create();
			    options.set("isStacked", true);
			    //set some options

			    Options series_options = Options.create();
			    series_options = Options.create();
			    series_options.set("color","black");
			    series_options.set("0",series_options);
			    options.set("series",series_options);
			    return options;
			}
			private Options createOptions() {
				Options options = Options.create();
				options.setWidth(1200);
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
