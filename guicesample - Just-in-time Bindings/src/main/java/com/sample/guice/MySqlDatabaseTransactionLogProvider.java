package com.sample.guice;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class MySqlDatabaseTransactionLogProvider implements
		Provider<TransactionLog> {
	private Service service;

	@Inject
	public MySqlDatabaseTransactionLogProvider(Service service) {
		this.service = service;
		System.out.println("MySqlDatabaseTransactionLogProvider Service Constructor");
	}

	public TransactionLog get() {
		MySqlDatabaseTransactionLog databaseTransactionLog = new MySqlDatabaseTransactionLog();
		databaseTransactionLog.setUrl("tmep/url");
		databaseTransactionLog.setThreadLimit(1);
		databaseTransactionLog.setService(service);
		return databaseTransactionLog;
	}

}
