package au.com.showcase.application.server;

import java.util.Date;

import au.com.showcase.application.shared.counter.PendingTransaction;
import au.com.showcase.application.shared.counter.action.PendingTransactions;
import au.com.showcase.application.shared.counter.action.PendingTransactionsResult;

import com.google.inject.Inject;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;

public class PendingTransactionActionHandler implements
		ActionHandler<PendingTransactions, PendingTransactionsResult> {

	@Inject
	public PendingTransactionActionHandler() {
	}

	@Override
	public PendingTransactionsResult execute(PendingTransactions action,
			ExecutionContext context) throws ActionException {

		PendingTransactionsResult pendingTransactionsResult = new PendingTransactionsResult();

		System.out.println(action.getName());

		for (int i = 0; i < 10; i++) {

			PendingTransaction pendingTransaction = new PendingTransaction();
			System.out.println(i + ":" + pendingTransaction);
			pendingTransaction.setBalance((float) i);
			pendingTransaction.setPendingAmount((float) i);
			pendingTransaction.setTotalAmount((float) i);
			pendingTransaction.setTransactionRefNo("" + i);
			pendingTransaction.setTransactionTime(new Date());
			pendingTransaction.setTransactionType("MG");
			pendingTransaction.setUsername("benben");
			pendingTransaction.setCounterRefNo("ABC");
			System.out.println(pendingTransaction);
			pendingTransactionsResult.getPendingTransactions().add(
					pendingTransaction);
		}

		for (int i = 0; i < pendingTransactionsResult.getPendingTransactions()
				.size(); i++) {
			System.out.println(pendingTransactionsResult
					.getPendingTransactions().get(i));
		}
		System.out.println("Hai");

		return pendingTransactionsResult;
	}

	@Override
	public void undo(PendingTransactions action,
			PendingTransactionsResult result, ExecutionContext context)
			throws ActionException {
	}

	@Override
	public Class<PendingTransactions> getActionType() {
		return PendingTransactions.class;
	}
}
