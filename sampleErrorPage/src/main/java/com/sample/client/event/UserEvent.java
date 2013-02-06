package com.sample.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.EventHandler;
import java.lang.String;
import com.google.gwt.event.shared.HasHandlers;

public class UserEvent extends GwtEvent<UserEvent.UserHandler> {

	public static Type<UserHandler> TYPE = new Type<UserHandler>();
	private String firstName;
	private String lastName;

	public interface UserHandler extends EventHandler {
		void onUser(UserEvent event);
	}

	public UserEvent(String firstName, String lastName) {
		this.firstName = (firstName == null || firstName.trim().equals("")) ? "EMPTY VALUE ENTERED" : firstName ;
		this.lastName = (lastName == null || lastName.trim().equals("")) ? "EMPTY VALUE ENTERED" : lastName ;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	protected void dispatch(UserHandler handler) {
		handler.onUser(this);
	}

	@Override
	public Type<UserHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<UserHandler> getType() {
		return TYPE;
	}

	public static void fire(HasHandlers source, String firstName, String lastName) {
		source.fireEvent(new UserEvent(firstName, lastName));
	}
}
