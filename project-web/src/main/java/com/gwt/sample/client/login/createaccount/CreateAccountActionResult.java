package com.gwt.sample.client.login.createaccount;

import com.gwtplatform.dispatch.shared.Result;
import java.lang.Boolean;

public class CreateAccountActionResult implements Result {

	private Boolean accountedCreated;

	@SuppressWarnings("unused")
	private CreateAccountActionResult() {
		// For serialization only
	}

	public CreateAccountActionResult(Boolean accountedCreated) {
		this.accountedCreated = accountedCreated;
	}

	public Boolean getAccountedCreated() {
		return accountedCreated;
	}
}
