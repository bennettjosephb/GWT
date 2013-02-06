package com.sample.guice;

public class PaypalCreditCardProcessor implements CreditCardProcessor {
	
	public String toString(){
		return this.getClass().getName();
	}
	
	public PaypalCreditCardProcessor() {
		System.out.println("PaypalCreditCardProcessor Constructor");
	}

}
