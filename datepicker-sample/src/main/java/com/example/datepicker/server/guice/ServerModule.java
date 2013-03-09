package com.example.datepicker.server.guice;

import com.gwtplatform.dispatch.server.guice.HandlerModule;
import com.example.datepicker.client.widget.action.DatePicker;
import com.example.datepicker.server.DatePickerActionHandler;

public class ServerModule extends HandlerModule {

	@Override
	protected void configureHandlers() {

		bindHandler(DatePicker.class, DatePickerActionHandler.class);
	}
}
