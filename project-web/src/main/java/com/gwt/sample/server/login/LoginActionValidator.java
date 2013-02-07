package com.gwt.sample.server.login;

import com.gwtplatform.dispatch.server.actionvalidator.ActionValidator;
import com.gwtplatform.dispatch.shared.Action;
import com.gwtplatform.dispatch.shared.ActionException;
import com.gwtplatform.dispatch.shared.Result;

public class LoginActionValidator implements ActionValidator {

	@Override
	public boolean isValid(Action<? extends Result> action)
			throws ActionException {
		// TODO Auto-generated method stub
		
		System.out.println("LoginActionValidator" + action.getClass().getName());
		return true;
	}

}
