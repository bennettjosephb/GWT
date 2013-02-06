package com.sample.guice;

public class MyConcreteAnnotatedClass {
	public String toString(){
		return this.getClass().getName();
	}

	public MyConcreteAnnotatedClass() {
		System.out.println("MyConcreteAnnotatedClass Constructor");
	}
}
