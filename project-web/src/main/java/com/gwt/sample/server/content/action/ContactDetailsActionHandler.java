package com.gwt.sample.server.content.action;

import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import com.gwt.sample.client.content.action.ContactDetails;
import com.gwt.sample.client.content.action.ContactDetailsResult;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;

public class ContactDetailsActionHandler implements
		ActionHandler<ContactDetails, ContactDetailsResult> {

	@Inject
	public ContactDetailsActionHandler() {
	}

	@Override
	public ContactDetailsResult execute(ContactDetails action,
			ExecutionContext context) throws ActionException {
		System.out.println(action.getTemporaryStreet1()
				+ action.getTemporaryStreet2() + action.getTemporaryCity()
				+ action.getTemporaryState() + action.getTemporaryZipCode()
				+ action.getTemporaryCountry() + action.getPermanentStreet1()
				+ action.getPermanentStreet2() + action.getPermanentCity()
				+ action.getPermanentState() + action.getPermanentZipCode()
				+ action.getPermanentCountry() + action.getCopyAddress()
				+ action.getFaxNumber() + action.getHomeNumber()
				+ action.getMobileNumber() + action.getWorkNumber() + action.geteMailId());
		return new ContactDetailsResult(true);
	}

	@Override
	public void undo(ContactDetails action, ContactDetailsResult result,
			ExecutionContext context) throws ActionException {
	}

	@Override
	public Class<ContactDetails> getActionType() {
		return ContactDetails.class;
	}
}