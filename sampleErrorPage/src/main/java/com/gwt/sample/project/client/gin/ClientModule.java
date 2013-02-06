package com.gwt.sample.project.client.gin;


import com.gwt.sample.project.client.place.ClientPlaceManager;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwt.sample.project.client.SamplePresenter;
import com.gwt.sample.project.client.SampleView;
import com.gwt.sample.project.client.place.DefaultPlace;
import com.gwt.sample.project.client.place.NameTokens;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(SamplePresenter.class, SamplePresenter.MyView.class,
				SampleView.class, SamplePresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.sample);
	}
}
