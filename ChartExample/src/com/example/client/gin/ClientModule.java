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
	}
}
