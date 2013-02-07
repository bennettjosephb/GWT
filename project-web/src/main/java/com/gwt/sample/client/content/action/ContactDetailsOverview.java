package com.gwt.sample.client.content.action;

import com.gwtplatform.dispatch.shared.ActionImpl;

public class ContactDetailsOverview extends
		ActionImpl<ContactDetailsOverviewResult> {

	public ContactDetailsOverview() {
	}
	
	@Override
	public boolean isSecured() {
		return false;
	}

}
