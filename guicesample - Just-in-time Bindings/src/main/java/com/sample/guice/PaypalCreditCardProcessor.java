package com.sample.guice;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class PaypalCreditCardProcessor implements CreditCardProcessor {

	private String apiKey;

	public String toString() {
		return this.getClass().getName();
	}

	public PaypalCreditCardProcessor() {
		System.out.println("PaypalCreditCardProcessor Constructor");
	}

	@Inject
	public PaypalCreditCardProcessor(@Named("PayPal API key") String apiKey) {
		this.apiKey = apiKey;
		System.out.println("PaypalCreditCardProcessor String Argument Constructor");
	}
}
