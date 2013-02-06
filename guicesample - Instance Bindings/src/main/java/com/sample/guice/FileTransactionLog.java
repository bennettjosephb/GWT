package com.sample.guice;


public class FileTransactionLog implements TransactionLog {

	public String toString(){
		return this.getClass().getName();
	}

	public FileTransactionLog() {
		System.out.println("FileTransactionLog Constructor");
	}
}
