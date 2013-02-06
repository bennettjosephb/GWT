package com.sample.guice;

public class WebService implements Service {
	public String toString(){
		return this.getClass().getName();
	}

	public WebService() {
		System.out.println("WebService Constructor");
	}
}
