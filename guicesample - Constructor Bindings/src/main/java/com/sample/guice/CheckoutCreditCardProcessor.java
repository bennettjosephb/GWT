package com.sample.guice;

public class CheckoutCreditCardProcessor implements CreditCardProcessor {

	public String toString(){
		return this.getClass().getName();
	}

	public CheckoutCreditCardProcessor() {
		System.out.println("CheckoutCreditCardProcessor Constructor");
	}

}
