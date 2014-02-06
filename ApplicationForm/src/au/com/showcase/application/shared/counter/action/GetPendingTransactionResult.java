package au.com.showcase.application.shared.counter.action;

import java.util.ArrayList;
import java.util.List;

import au.com.showcase.application.shared.counter.PendingTransaction;

import com.gwtplatform.dispatch.shared.Result;

public class GetPendingTransactionResult implements Result {

	private List<PendingTransaction> pendingTransactions = new ArrayList<PendingTransaction>();

	@SuppressWarnings("unused")
	private GetPendingTransactionResult() {
		// For serialization only
	}

	public GetPendingTransactionResult(
			ArrayList<PendingTransaction> pendingTransactions) {
		this.pendingTransactions = pendingTransactions;
	}

	public List<PendingTransaction> getPendingTransactions() {
		return pendingTransactions;
	}
}
