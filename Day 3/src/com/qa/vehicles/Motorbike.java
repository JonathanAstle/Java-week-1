package com.qa.vehicles;

public class Motorbike extends Vehicle {
	private int bhp;
	
	public Motorbike(int id, int bhp) {
		super(id);
		this.bhp = bhp;
	}
	
	public int getBhp() {
		return bhp;
	}
	
	public void setBhp(int bhp) {
		System.out.println("bhp set to: " + bhp);
		this.bhp = bhp;
	}
}
