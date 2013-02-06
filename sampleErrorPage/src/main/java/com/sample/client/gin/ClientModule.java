package com.sample.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.sample.client.ContainerPresenter;
import com.sample.client.ContainerView;
import com.sample.client.ContentFooterPresenter;
import com.sample.client.ContentFooterView;
import com.sample.client.ContentHeaderPresenter;
import com.sample.client.ContentHeaderView;
import com.sample.client.ContentMenuPresenter;
import com.sample.client.ContentMenuView;
import com.sample.client.ContentPresenter;
import com.sample.client.ContentView;
import com.sample.client.place.ClientPlaceManager;
import com.sample.client.place.DefaultPlace;
import com.sample.client.place.NameTokens;
import com.sample.client.error.ErrorPresenter;
import com.sample.client.error.ErrorView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenterWidget(ContentHeaderPresenter.class,
				ContentHeaderPresenter.MyView.class, ContentHeaderView.class);

		bindPresenterWidget(ContentFooterPresenter.class,
				ContentFooterPresenter.MyView.class, ContentFooterView.class);

		bindPresenterWidget(ContentMenuPresenter.class,
				ContentMenuPresenter.MyView.class, ContentMenuView.class);

		bindPresenter(ContainerPresenter.class,
				ContainerPresenter.MyView.class, ContainerView.class,
				ContainerPresenter.MyProxy.class);

		bindPresenter(ContentPresenter.class, ContentPresenter.MyView.class,
				ContentView.class, ContentPresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.profile);

		bindPresenter(ErrorPresenter.class, ErrorPresenter.MyView.class,
				ErrorView.class, ErrorPresenter.MyProxy.class);
	}
}
