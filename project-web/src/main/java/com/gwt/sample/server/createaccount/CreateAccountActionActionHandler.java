package com.gwt.sample.server.createaccount;

import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import com.gwt.sample.client.login.createaccount.CreateAccountAction;
import com.gwt.sample.client.login.createaccount.CreateAccountActionResult;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;

public class CreateAccountActionActionHandler implements
		ActionHandler<CreateAccountAction, CreateAccountActionResult> {

	@Inject
	public CreateAccountActionActionHandler() {
	}

	@Override
	public CreateAccountActionResult execute(CreateAccountAction action,
			ExecutionContext context) throws ActionException {
		System.out.println(action.getFirstName());
		System.out.println(action.getLastName());
		System.out.println(action.getConfirmPassword());
		System.out.println(action.getDateOfBirth());
		System.out.println(action.getGender());
		System.out.println(action.getLocation());
		System.out.println(action.getPassword());
		System.out.println(action.getPhoneNumber());
		System.out.println(action.getServiceName());
		System.out.println(action.getUsername());
		return new CreateAccountActionResult(true);
	}

	@Override
	public void undo(CreateAccountAction action, CreateAccountActionResult result,
			ExecutionContext context) throws ActionException {
	}

	@Override
	public Class<CreateAccountAction> getActionType() {
		return CreateAccountAction.class;
	}
}
