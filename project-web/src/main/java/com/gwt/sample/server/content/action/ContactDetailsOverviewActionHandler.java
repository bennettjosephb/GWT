package com.gwt.sample.server.content.action;

import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import com.gwt.sample.client.content.action.ContactDetailsOverview;
import com.gwt.sample.client.content.action.ContactDetailsOverviewResult;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;

public class ContactDetailsOverviewActionHandler implements
		ActionHandler<ContactDetailsOverview, ContactDetailsOverviewResult> {

	@Inject
	public ContactDetailsOverviewActionHandler() {
	}

	@Override
	public ContactDetailsOverviewResult execute(ContactDetailsOverview action,
			ExecutionContext context) throws ActionException {
		System.out.println("Loading...");
		ContactDetailsOverviewResult contactDetailsOverviewResult = new ContactDetailsOverviewResult(
				"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA",
				"BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB",
				"CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC",
				"DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD",
				"EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE",
				"FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF",
				"GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG",
				"HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH",
				"I", "J", "K", "L", "M", "N", "O", "P", "emIla", "ZZ");
		return contactDetailsOverviewResult;
	}

	@Override
	public void undo(ContactDetailsOverview action,
			ContactDetailsOverviewResult result, ExecutionContext context)
			throws ActionException {
	}

	@Override
	public Class<ContactDetailsOverview> getActionType() {
		return ContactDetailsOverview.class;
	}
}
