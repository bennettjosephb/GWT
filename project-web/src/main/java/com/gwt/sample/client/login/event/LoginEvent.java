package com.gwt.sample.client.login.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.EventHandler;
import java.lang.String;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.event.shared.HandlerRegistration;

public class LoginEvent extends GwtEvent<LoginEvent.LoginHandler> {

	public static Type<LoginHandler> TYPE = new Type<LoginHandler>();
	private String username;
	private String password;

	public interface LoginHandler extends EventHandler {
		void onLogin(LoginEvent event);
	}

	public interface LoginHasHandlers extends HasHandlers {
		HandlerRegistration addLoginHandler(LoginHandler handler);
	}

	public LoginEvent(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	@Override
	protected void dispatch(LoginHandler handler) {
		handler.onLogin(this);
	}

	@Override
	public Type<LoginHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<LoginHandler> getType() {
		return TYPE;
	}

	public static void fire(HasHandlers source, String username, String password) {
		source.fireEvent(new LoginEvent(username, password));
	}
}
