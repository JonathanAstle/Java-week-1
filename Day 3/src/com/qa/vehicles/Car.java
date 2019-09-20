package com.qa.vehicles;

public class Car extends Vehicle {
	private int wheels;
	
	public Car(int id, int wheels) {
		super(id);
		this.wheels = wheels;
	}
	
	public int getWheels() {
		return wheels;
	}
	
	public void setWheels(int wheels) {
		System.out.println("number of wheels set to " + wheels);
		this.wheels = wheels;
	}
	
	public void beep() {
		System.out.println("meep meep");
	}
}
