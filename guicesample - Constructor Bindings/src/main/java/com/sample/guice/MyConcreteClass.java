package com.sample.guice;

public class MyConcreteClass {
	public String toString(){
		return this.getClass().getName();
	}

	public MyConcreteClass() {
		System.out.println("MyConcreteClass Constructor");
	}

}
