package com.sample.guice;

import com.google.inject.ImplementedBy;

@ImplementedBy(PaypalCreditCardProcessor.class)
public interface CreditCardProcessor {

}
