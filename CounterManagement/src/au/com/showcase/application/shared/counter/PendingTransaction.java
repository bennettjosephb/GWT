package au.com.showcase.application.shared.counter;

import java.io.Serializable;
import java.util.Date;

public class PendingTransaction implements Serializable {

	private static final long serialVersionUID = 1L;

	public PendingTransaction() {

	}

	private String username;

	private Date transactionTime;

	private String counterRefNo;

	private String transactionRefNo;

	private String transactionType;

	private Float totalAmount;

	private Float pendingAmount;

	private Float balance;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCounterRefNo() {
		return counterRefNo;
	}

	public void setCounterRefNo(String counterRefNo) {
		this.counterRefNo = counterRefNo;
	}

	public String getTransactionRefNo() {
		return transactionRefNo;
	}

	public void setTransactionRefNo(String transactionRefNo) {
		this.transactionRefNo = transactionRefNo;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Float getPendingAmount() {
		return pendingAmount;
	}

	public void setPendingAmount(Float pendingAmount) {
		this.pendingAmount = pendingAmount;
	}

	public Float getBalance() {
		return balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	public Date getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}

	// @Override
	// public String toString() {
	// return getCounterRefNo();
	// }

}
