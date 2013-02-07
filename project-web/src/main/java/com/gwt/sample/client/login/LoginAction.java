package com.gwt.sample.client.login;

import com.gwtplatform.dispatch.shared.ActionImpl;
import com.gwt.sample.client.login.LoginActionResult;
import java.lang.String;

public class LoginAction extends ActionImpl<LoginActionResult> {

	private String username;
	private String password;

	@SuppressWarnings("unused")
	private LoginAction() {
		// For serialization only
	}
	
	@Override
	public boolean isSecured() {
		return false;
	}

	public LoginAction(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}
