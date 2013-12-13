package com.example.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.example.client.place.ClientPlaceManager;
import com.example.client.PieChartPresenter;
import com.example.client.PieChartView;
import com.example.client.place.DefaultPlace;
import com.example.client.place.NameTokens;
import com.example.client.CanvasChartPresenter;
import com.example.client.CanvasChartView;
import com.example.client.ColumnChartPresenter;
import com.example.client.ColumnChartView;
import com.example.client.LineChartPresenter;
import com.example.client.LineChartView;
import com.example.client.BarChartPresenter;
import com.example.client.BarChartView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(PieChartPresenter.class, PieChartPresenter.MyView.class,
				PieChartView.class, PieChartPresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class)
				.to(NameTokens.piechart);

		bindPresenter(CanvasChartPresenter.class,
				CanvasChartPresenter.MyView.class, CanvasChartView.class,
				CanvasChartPresenter.MyProxy.class);

		bindPresenter(ColumnChartPresenter.class,
				ColumnChartPresenter.MyView.class, ColumnChartView.class,
				ColumnChartPresenter.MyProxy.class);

		bindPresenter(LineChartPresenter.class,
				LineChartPresenter.MyView.class, LineChartView.class,
				LineChartPresenter.MyProxy.class);

		bindPresenter(BarChartPresenter.class, BarChartPresenter.MyView.class,
				BarChartView.class, BarChartPresenter.MyProxy.class);
	}
}
