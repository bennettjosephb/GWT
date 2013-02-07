package com.gwt.sample.server.login;

import com.google.inject.Inject;
import com.gwt.sample.client.login.LoginAction;
import com.gwt.sample.client.login.LoginActionResult;
import com.gwt.sample.server.encrypt.BCrypt;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;

public class LoginActionActionHandler implements
		ActionHandler<LoginAction, LoginActionResult> {

	@Inject
	public LoginActionActionHandler() {
	}

	@Override
	public LoginActionResult execute(LoginAction action, ExecutionContext context)
			throws ActionException {
		String username = action.getUsername();
		String password = action.getPassword();
		
		String hashValue = BCrypt.hashpw(password, BCrypt.gensalt());
		System.out.println(username);
		System.out.println(password);
		System.out.println(hashValue);
		boolean valid = BCrypt.checkpw(password, hashValue);
		System.out.println(valid);
		return new LoginActionResult(hashValue);
	}

	@Override
	public void undo(LoginAction action, LoginActionResult result,
			ExecutionContext context) throws ActionException {
	}

	@Override
	public Class<LoginAction> getActionType() {
		return LoginAction.class;
	}
}
