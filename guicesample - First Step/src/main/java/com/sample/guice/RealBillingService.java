package com.sample.guice;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class RealBillingService implements BillingService {
	private CreditCardProcessor processor;
	private TransactionLog transactionLog;

	public String toString(){
		return this.getClass().getName();
	}

	public RealBillingService() {
		System.out.println("RealBillingService Constructor");
	}

	@Inject
	RealBillingService(CreditCardProcessor processor,
			TransactionLog transactionLog) {
		System.out.println("RealBillingService Constructor");
		this.processor = processor;
		this.transactionLog = transactionLog;
		System.out.println("CreditCardProcessor : "+processor);
		System.out.println("TransactionLog : "+transactionLog);
	}

}
