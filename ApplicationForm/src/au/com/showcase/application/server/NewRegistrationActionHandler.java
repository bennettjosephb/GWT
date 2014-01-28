package au.com.showcase.application.server;

import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import au.com.showcase.application.client.account.NewRegistration;
import au.com.showcase.application.client.account.NewRegistrationResult;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;

public class NewRegistrationActionHandler implements
		ActionHandler<NewRegistration, NewRegistrationResult> {

	@Inject
	public NewRegistrationActionHandler() {
	}

	@Override
	public NewRegistrationResult execute(NewRegistration action,
			ExecutionContext context) throws ActionException {
		return null;
	}

	@Override
	public void undo(NewRegistration action, NewRegistrationResult result,
			ExecutionContext context) throws ActionException {
	}

	@Override
	public Class<NewRegistration> getActionType() {
		return NewRegistration.class;
	}
}
