package com.sample.guice;

import com.google.inject.Provider;

public class MySqlDatabaseTransactionLog extends DatabaseTransactionLog implements Provider<TransactionLog>{

	public String toString(){
		return this.getClass().getName();
	}

	public MySqlDatabaseTransactionLog() {
		System.out.println("MySqlDatabaseTransactionLog Constructor");
	}

	public TransactionLog get() {
		
		return null;
	}


}
