package com.example.datepicker.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.example.datepicker.client.place.ClientPlaceManager;
import com.example.datepicker.client.DatePickerSamplePresenter;
import com.example.datepicker.client.DatePickerSampleView;
import com.example.datepicker.client.place.DefaultPlace;
import com.example.datepicker.client.place.NameTokens;
import com.example.datepicker.client.DatePickerSampleDialogPresenter;
import com.example.datepicker.client.DatePickerSampleDialogView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(DatePickerSamplePresenter.class,
				DatePickerSamplePresenter.MyView.class,
				DatePickerSampleView.class,
				DatePickerSamplePresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.root);

		bindPresenterWidget(DatePickerSampleDialogPresenter.class,
				DatePickerSampleDialogPresenter.MyView.class,
				DatePickerSampleDialogView.class);
	}
}
