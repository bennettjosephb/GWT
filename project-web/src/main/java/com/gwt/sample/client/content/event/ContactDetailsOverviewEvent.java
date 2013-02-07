package com.gwt.sample.client.content.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;

public class ContactDetailsOverviewEvent extends
		GwtEvent<ContactDetailsOverviewHandler> {

	public static Type<ContactDetailsOverviewHandler> TYPE = new Type<ContactDetailsOverviewHandler>();

	public ContactDetailsOverviewEvent() {
	}

	@Override
	protected void dispatch(ContactDetailsOverviewHandler handler) {
		handler.onContactDetailsOverview(this);
	}

	@Override
	public Type<ContactDetailsOverviewHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<ContactDetailsOverviewHandler> getType() {
		return TYPE;
	}

	public static void fire(HasHandlers source) {
		source.fireEvent(new ContactDetailsOverviewEvent());
	}
}
