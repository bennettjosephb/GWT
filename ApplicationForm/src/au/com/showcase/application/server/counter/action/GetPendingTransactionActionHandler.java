package au.com.showcase.application.server.counter.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import au.com.showcase.application.shared.counter.PendingTransaction;
import au.com.showcase.application.shared.counter.action.GetPendingTransaction;
import au.com.showcase.application.shared.counter.action.GetPendingTransactionResult;

import com.google.inject.Inject;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;

public class GetPendingTransactionActionHandler implements
		ActionHandler<GetPendingTransaction, GetPendingTransactionResult> {

	@Inject
	public GetPendingTransactionActionHandler() {
	}

	@Override
	public GetPendingTransactionResult execute(GetPendingTransaction action,
			ExecutionContext context) throws ActionException {

		ArrayList<PendingTransaction> list = new ArrayList<PendingTransaction>();

		for (int i = 0; i < 7; i++) {
			PendingTransaction pendingTransaction = new PendingTransaction();
			System.out.println(i + ":" + pendingTransaction);
			pendingTransaction.setBalance(new Random().nextFloat());
			pendingTransaction.setPendingAmount(new Random().nextFloat());
			pendingTransaction.setTotalAmount(new Random().nextFloat());
			pendingTransaction.setTransactionRefNo("2141970206151904");
			pendingTransaction.setTransactionTime(new Date());
			pendingTransaction.setTransactionType("MG");
			pendingTransaction.setUsername("benben");
			pendingTransaction.setCounterRefNo("ABC");

			System.out.println(pendingTransaction);
			list.add(pendingTransaction);
		}
		GetPendingTransactionResult getPendingTransactionResult = new GetPendingTransactionResult(
				list);

		return getPendingTransactionResult;
	}

	@Override
	public void undo(GetPendingTransaction action,
			GetPendingTransactionResult result, ExecutionContext context)
			throws ActionException {
	}

	@Override
	public Class<GetPendingTransaction> getActionType() {
		return GetPendingTransaction.class;
	}
}
