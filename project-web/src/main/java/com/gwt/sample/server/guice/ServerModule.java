package com.gwt.sample.server.guice;

import com.gwtplatform.dispatch.server.guice.HandlerModule;
import com.gwt.sample.shared.SendTextToServer;
import com.gwt.sample.server.SendTextToServerActionHandler;
import com.gwt.sample.client.login.LoginAction;
import com.gwt.sample.server.login.LoginActionActionHandler;
import com.gwt.sample.server.login.LoginActionValidator;
import com.gwt.sample.client.login.createaccount.CreateAccountAction;
import com.gwt.sample.server.createaccount.CreateAccountActionActionHandler;
import com.gwt.sample.client.content.action.ContactDetails;
import com.gwt.sample.server.content.action.ContactDetailsActionHandler;
import com.gwt.sample.server.content.action.ContactDetailsActionValidator;
import com.gwt.sample.client.content.action.Sample;
import com.gwt.sample.server.content.action.SampleActionHandler;
import com.gwt.sample.client.content.action.ContactDetailsOverview;
import com.gwt.sample.server.content.action.ContactDetailsOverviewActionHandler;
import com.gwt.sample.client.common.action.DatePicker;
import com.gwt.sample.server.common.action.DatePickerActionHandler;
import com.gwt.sample.client.content.action.SkillsetAction;
import com.gwt.sample.server.content.action.SkillsetActionHandler;

public class ServerModule extends HandlerModule {

	@Override
	protected void configureHandlers() {

		bindHandler(SendTextToServer.class, SendTextToServerActionHandler.class);

		bindHandler(LoginAction.class, LoginActionActionHandler.class,
				LoginActionValidator.class);

		bindHandler(CreateAccountAction.class,
				CreateAccountActionActionHandler.class);

		bindHandler(ContactDetails.class, ContactDetailsActionHandler.class, ContactDetailsActionValidator.class);

		bindHandler(Sample.class, SampleActionHandler.class);

		bindHandler(ContactDetailsOverview.class,
				ContactDetailsOverviewActionHandler.class);

		bindHandler(DatePicker.class, DatePickerActionHandler.class);

		bindHandler(SkillsetAction.class, SkillsetActionHandler.class);
	}
}
