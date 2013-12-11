package com.example.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.example.client.place.ClientPlaceManager;
import com.example.client.PieChartPresenter;
import com.example.client.PieChartView;
import com.example.client.place.DefaultPlace;
import com.example.client.place.NameTokens;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(PieChartPresenter.class, PieChartPresenter.MyView.class,
				PieChartView.class, PieChartPresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class)
				.to(NameTokens.piechart);
	}
}
