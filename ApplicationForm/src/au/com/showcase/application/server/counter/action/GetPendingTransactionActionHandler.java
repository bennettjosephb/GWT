package au.com.showcase.application.server.counter.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

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

		Set<Date> date = new HashSet<Date>();

		Set<String> username = new HashSet<String>();

		Set<String> counterRefno = new HashSet<String>();

		Set<String> transactionRefNo = new HashSet<String>();

		Set<String> transactionType = new HashSet<String>();

		Set<Float> totalAmount = new HashSet<Float>();

		Set<Float> pendingAmount = new HashSet<Float>();

		Set<Float> balanceAmount = new HashSet<Float>();

		for (int i = 0; i < 7; i++) {
			PendingTransaction pendingTransaction = new PendingTransaction();
			System.out.println(i + ":" + pendingTransaction);
			pendingTransaction.setBalance(new Random().nextFloat());
			pendingTransaction.setPendingAmount(new Random().nextFloat());
			pendingTransaction.setTotalAmount(new Random().nextFloat());
			pendingTransaction.setTransactionRefNo("214197020" + i);
			pendingTransaction.setTransactionTime(new Date());
			pendingTransaction.setTransactionType((i % 2 == 0) ? "MG" : "SC");
			pendingTransaction.setUsername("benben");
			pendingTransaction.setCounterRefNo("ABC" + (i * 3));

			if (!date.contains(pendingTransaction.getTransactionTime())) {
				date.add(pendingTransaction.getTransactionTime());
			}

			if (!username.contains(pendingTransaction.getUsername())) {
				username.add(pendingTransaction.getUsername());
			}

			if (!counterRefno.contains(pendingTransaction.getCounterRefNo())) {
				counterRefno.add(pendingTransaction.getCounterRefNo());
			}

			if (!transactionRefNo.contains(pendingTransaction
					.getTransactionRefNo())) {
				transactionRefNo.add(pendingTransaction.getTransactionRefNo());
			}

			if (!transactionType.contains(pendingTransaction
					.getTransactionType())) {
				transactionType.add(pendingTransaction.getTransactionType());
			}

			if (!totalAmount.contains(pendingTransaction.getTotalAmount())) {
				totalAmount.add(pendingTransaction.getTotalAmount());
			}

			if (!pendingAmount.contains(pendingTransaction.getTotalAmount())) {
				pendingAmount.add(pendingTransaction.getTotalAmount());
			}

			if (!balanceAmount.contains(pendingTransaction.getBalance())) {
				balanceAmount.add(pendingTransaction.getBalance());
			}

			list.add(pendingTransaction);

		}
		GetPendingTransactionResult getPendingTransactionResult = new GetPendingTransactionResult(
				list);

		getPendingTransactionResult.setCounterRefno(new ArrayList<String>(
				counterRefno));

		getPendingTransactionResult.setTransactionRefNo(new ArrayList<String>(
				transactionRefNo));

		getPendingTransactionResult.setTransactionType(new ArrayList<String>(
				transactionType));

		getPendingTransactionResult.setTotalAmount(new ArrayList<Float>(
				totalAmount));

		getPendingTransactionResult.setPendingAmount(new ArrayList<Float>(
				pendingAmount));

		getPendingTransactionResult.setBalanceAmount(new ArrayList<Float>(
				balanceAmount));

		getPendingTransactionResult
				.setUsername(new ArrayList<String>(username));

		getPendingTransactionResult.setDate(new ArrayList<Date>(date));

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
