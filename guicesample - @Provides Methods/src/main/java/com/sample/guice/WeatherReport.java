package com.sample.guice;

public class WeatherReport implements Report {
	public String toString(){
		return this.getClass().getName();
	}

	public WeatherReport() {
		System.out.println("WeatherReport Constructor");
	}

}
