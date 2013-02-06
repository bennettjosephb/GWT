package com.sample.guice;

public abstract class DatabaseTransactionLog implements TransactionLog {
	
	private String url;
	
	private Integer threadLimit;
	
	public String geturl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getThreadLimit() {
		return threadLimit;
	}

	public void setThreadLimit(Integer threadLimit) {
		this.threadLimit = threadLimit;
	}

	public String toString(){
		return this.getClass().getName();
	}

	public DatabaseTransactionLog() {
		System.out.println("DatabaseTransactionLog Constructor");
	}
}