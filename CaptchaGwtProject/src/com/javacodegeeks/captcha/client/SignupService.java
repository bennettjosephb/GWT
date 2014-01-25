package com.javacodegeeks.captcha.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("signup")
public interface SignupService extends RemoteService {
	
	boolean performSignup(String username, String password, String userCaptcha);
	
}
