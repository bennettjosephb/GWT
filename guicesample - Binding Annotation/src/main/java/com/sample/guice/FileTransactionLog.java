package com.sample.guice;

import java.util.logging.Logger;

public class FileTransactionLog implements TransactionLog {

	public String toString(){
		return this.getClass().getName();
	}

	public FileTransactionLog() {
		System.out.println("FileTransactionLog Constructor");
	}
}
