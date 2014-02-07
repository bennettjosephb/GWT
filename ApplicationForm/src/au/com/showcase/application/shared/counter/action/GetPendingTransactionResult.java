package au.com.showcase.application.shared.counter.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import au.com.showcase.application.shared.counter.PendingTransaction;

import com.gwtplatform.dispatch.shared.Result;

public class GetPendingTransactionResult implements Result {

	private List<PendingTransaction> pendingTransactions = new ArrayList<PendingTransaction>();

	private List<Date> date = new ArrayList<Date>();

	private List<String> username = new ArrayList<String>();

	private List<String> counterRefno = new ArrayList<String>();

	private List<String> transactionRefNo = new ArrayList<String>();

	private List<String> transactionType = new ArrayList<String>();

	private List<Float> totalAmount = new ArrayList<Float>();

	private List<Float> pendingAmount = new ArrayList<Float>();

	private List<Float> balanceAmount = new ArrayList<Float>();

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

	public List<Date> getDate() {
		return date;
	}

	public void setDate(List<Date> date) {
		this.date = date;
	}

	public List<String> getUsername() {
		return username;
	}

	public void setUsername(List<String> username) {
		this.username = username;
	}

	public List<String> getCounterRefno() {
		return counterRefno;
	}

	public void setCounterRefno(List<String> counterRefno) {
		this.counterRefno = counterRefno;
	}

	public List<String> getTransactionRefNo() {
		return transactionRefNo;
	}

	public void setTransactionRefNo(List<String> transactionRefNo) {
		this.transactionRefNo = transactionRefNo;
	}

	public List<String> getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(List<String> transactionType) {
		this.transactionType = transactionType;
	}

	public List<Float> getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(List<Float> totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<Float> getPendingAmount() {
		return pendingAmount;
	}

	public void setPendingAmount(List<Float> pendingAmount) {
		this.pendingAmount = pendingAmount;
	}

	public List<Float> getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(List<Float> balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public void setPendingTransactions(
			List<PendingTransaction> pendingTransactions) {
		this.pendingTransactions = pendingTransactions;
	}
}
