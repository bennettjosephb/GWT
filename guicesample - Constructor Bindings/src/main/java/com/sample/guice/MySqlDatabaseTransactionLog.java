package com.sample.guice;

import java.util.logging.Logger;

import com.google.inject.Provider;

public class MySqlDatabaseTransactionLog extends DatabaseTransactionLog implements Provider<TransactionLog>{

	public String toString(){
		return this.getClass().getName();
	}

	public MySqlDatabaseTransactionLog() {
		System.out.println("MySqlDatabaseTransactionLog Constructor");
	}

	public MySqlDatabaseTransactionLog(Logger logger) {
		System.out.println("This Constructor Is Used For Constructor-Binding");
		System.out.println("DatabaseTransactionLog Logger Constructor");
	}
	public TransactionLog get() {
		
		return null;
	}


}
