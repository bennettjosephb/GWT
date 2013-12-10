package com.client.gin;

import com.client.place.ClientPlaceManager;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.client.TestingPresenter;
import com.client.TestingView;
import com.client.place.DefaultPlace;
import com.client.place.NameTokens;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(TestingPresenter.class, TestingPresenter.MyView.class,
				TestingView.class, TestingPresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.test);
	}
}
