package com.sample.guice;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class RealBillingService implements BillingService {
	private CreditCardProcessor processor;
	private CreditCardProcessor checkoutProcessor;
	private TransactionLog transactionLog;
	private TransactionLog fileTransactionLog;

	public String toString(){
		return this.getClass().getName();
	}

	public RealBillingService() {
		System.out.println("RealBillingService Constructor");
	}

	@Inject
	RealBillingService(CreditCardProcessor processor, @Named("Checkout") CreditCardProcessor checkoutProcessor, TransactionLog transactionLog, @File TransactionLog fileTransactionLog) {
		System.out.println("RealBillingService Constructor");
		this.processor = processor;
		this.checkoutProcessor = checkoutProcessor;
		this.transactionLog = transactionLog;
		this.fileTransactionLog = fileTransactionLog;
		System.out.println("CreditCardProcessor : "+processor);
		System.out.println("CheckoutCreditCardProcessor : "+checkoutProcessor);
		System.out.println("TransactionLog : "+transactionLog);
		System.out.println("FileTransactionLog : "+fileTransactionLog);
	}

}
