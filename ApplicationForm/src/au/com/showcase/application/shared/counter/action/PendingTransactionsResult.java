package au.com.showcase.application.shared.counter.action;

import java.util.ArrayList;

import au.com.showcase.application.shared.counter.PendingTransaction;

import com.gwtplatform.dispatch.shared.Result;

public class PendingTransactionsResult implements Result {

	public PendingTransactionsResult() {
	}

	private ArrayList<PendingTransaction> pendingTransactions = new ArrayList<PendingTransaction>();

	public ArrayList<PendingTransaction> getPendingTransactions() {
		return pendingTransactions;
	}

}
