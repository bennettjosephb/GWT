package com.sample.guice;

public class MySqlDatabaseTransactionLog extends DatabaseTransactionLog{
	public String toString(){
		return this.getClass().getName();
	}

	public MySqlDatabaseTransactionLog() {
		System.out.println("MySqlDatabaseTransactionLog Constructor");
	}


}
