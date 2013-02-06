package com.gwt.example.dialog.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwt.example.dialog.client.place.ClientPlaceManager;
import com.gwt.example.dialog.client.DialogExamplePresenter;
import com.gwt.example.dialog.client.DialogExampleView;
import com.gwt.example.dialog.client.place.DefaultPlace;
import com.gwt.example.dialog.client.place.NameTokens;
import com.gwt.example.dialog.client.DialogWindowPresenter;
import com.gwt.example.dialog.client.DialogWindowView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(DialogExamplePresenter.class,
				DialogExamplePresenter.MyView.class, DialogExampleView.class,
				DialogExamplePresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.dialog);

		bindPresenterWidget(DialogWindowPresenter.class,
				DialogWindowPresenter.MyView.class, DialogWindowView.class);
	}
}
