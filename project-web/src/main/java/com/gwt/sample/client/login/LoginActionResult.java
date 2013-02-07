package com.gwt.sample.client.login;

import com.gwtplatform.dispatch.shared.Result;
import java.lang.String;

public class LoginActionResult implements Result {

	private String sessionId;

	@SuppressWarnings("unused")
	private LoginActionResult() {
		// For serialization only
	}

	public LoginActionResult(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSessionId() {
		return sessionId;
	}
}
