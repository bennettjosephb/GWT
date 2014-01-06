package au.com.showcase.application.server;

import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;

import au.com.showcase.application.client.TestingHandler;
import au.com.showcase.application.client.TestingHandlerResult;
import au.com.showcase.application.shared.ResultData;

import com.google.inject.Inject;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;

public class TestingHandlerActionHandler implements
		ActionHandler<TestingHandler, TestingHandlerResult> {

	@Inject
	public TestingHandlerActionHandler() {
	}

	@Override
	public TestingHandlerResult execute(TestingHandler action,
			ExecutionContext context) throws ActionException {
		
		System.out.println(action.getDataset().getOne());

		ResultData resultdate = new ResultData();

		resultdate.setName("Bennet");

		TestingHandlerResult testingHandlerResult = new TestingHandlerResult(
				resultdate);
		return testingHandlerResult;
	}

	@Override
	public void undo(TestingHandler action, TestingHandlerResult result,
			ExecutionContext context) throws ActionException {
	}

	@Override
	public Class<TestingHandler> getActionType() {
		return TestingHandler.class;
	}
}
