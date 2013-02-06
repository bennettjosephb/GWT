package com.sample.guice;


public class FileTransactionLog implements TransactionLog {
	
	private String path;
	private Integer size;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String toString(){
		return this.getClass().getName();
	}

	public FileTransactionLog() {
		System.out.println("FileTransactionLog Constructor");
	}
}
