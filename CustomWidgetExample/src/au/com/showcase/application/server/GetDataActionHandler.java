package au.com.showcase.application.server;

import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import au.com.showcase.application.client.GetData;
import au.com.showcase.application.client.GetDataResult;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;

public class GetDataActionHandler implements
		ActionHandler<GetData, GetDataResult> {

	@Inject
	public GetDataActionHandler() {
	}

	@Override
	public GetDataResult execute(GetData action, ExecutionContext context)
			throws ActionException {
		
		System.out.println(action.getOne());
		
		return new GetDataResult(action.getOne().toLowerCase());
	}

	@Override
	public void undo(GetData action, GetDataResult result,
			ExecutionContext context) throws ActionException {
	}

	@Override
	public Class<GetData> getActionType() {
		return GetData.class;
	}
}
