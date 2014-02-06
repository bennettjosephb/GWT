package au.com.showcase.application.shared.counter.action;

import com.gwtplatform.dispatch.shared.ActionImpl;
import au.com.showcase.application.shared.counter.action.GetPendingTransactionResult;
import java.lang.String;

public class GetPendingTransaction extends
		ActionImpl<GetPendingTransactionResult> {

	private String name;

	@Override
	public boolean isSecured() {
		return false;
	}

	@SuppressWarnings("unused")
	private GetPendingTransaction() {
		// For serialization only
	}

	public GetPendingTransaction(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
