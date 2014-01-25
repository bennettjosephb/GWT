package com.javacodegeeks.captcha.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SignupServiceAsync {
	
	void performSignup(String username, String password, String userCaptcha, AsyncCallback<Boolean> callback);
	
}
