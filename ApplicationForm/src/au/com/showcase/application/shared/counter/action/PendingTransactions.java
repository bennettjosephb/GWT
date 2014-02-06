package au.com.showcase.application.shared.counter.action;

import com.gwtplatform.dispatch.shared.ActionImpl;

public class PendingTransactions extends ActionImpl<PendingTransactionsResult> {

	@Override
	public boolean isSecured() {
		return false;
	}

	public PendingTransactions(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}