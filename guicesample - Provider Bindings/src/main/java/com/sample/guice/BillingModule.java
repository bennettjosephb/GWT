package com.sample.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

public class BillingModule extends AbstractModule {
	@Override
	protected void configure() {

		/*
		 * This tells Guice that whenever it sees a dependency on a
		 * TransactionLog, it should satisfy the dependency using a
		 * DatabaseTransactionLog.
		 */
		// bind(TransactionLog.class).to(DatabaseTransactionLog.class);
		//
		// // Linked Binding
		// bind(DatabaseTransactionLog.class)
		// .to(MySqlDatabaseTransactionLog.class);

		// Binding Annotations
		// bind(TransactionLog.class).annotatedWith(File.class).to(
		// FileTransactionLog.class);
		
		bind(TransactionLog.class).toProvider(MySqlDatabaseTransactionLogProvider.class);
		

		// @Named
		bind(CreditCardProcessor.class).annotatedWith(Names.named("Checkout"))
				.to(CheckoutCreditCardProcessor.class);

		// Instance Bindings
		bind(String.class).annotatedWith(Names.named("insert")).toInstance(
				"EXAMPLE INSTANCE");
		bind(Report.class).annotatedWith(Names.named("report")).toInstance(
				new WeatherReport());

		/*
		 * Similarly, this binding tells Guice that when CreditCardProcessor is
		 * used in a dependency, that should be satisfied with a
		 * PaypalCreditCardProcessor.
		 */
		bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
		
		bind(Service.class).to(WebService.class);

		bind(BillingService.class).to(RealBillingService.class);
	}

//	@Provides
//	TransactionLog provideTransactionLog() {
//		DatabaseTransactionLog transactionLog = new MySqlDatabaseTransactionLog();
//		transactionLog.setUrl("jdbc:mysql://localhost/pizza");
//		transactionLog.setThreadLimit(30);
//		return transactionLog;
//	}

	@Provides
	@File
	TransactionLog provideFileTransactionLog() {
		FileTransactionLog transactionLog = new FileTransactionLog();
		transactionLog.setPath("jdbc:mysql://localhost/pizza");
		transactionLog.setSize(30);
		return transactionLog;
	}

}