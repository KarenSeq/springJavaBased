package com.learn.spring.java.model;

public class Car {
	
	private String brand;
	
	private ElectricCar ec;

	public ElectricCar getEc() {
		return ec;
	}

	public void setEc(ElectricCar ec) {
		this.ec = ec;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
