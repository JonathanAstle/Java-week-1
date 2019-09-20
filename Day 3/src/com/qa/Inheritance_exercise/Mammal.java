package com.qa.Inheritance_exercise;

public class Mammal extends Animal {
	public String furOrHair;
	public int numberOfLegs;
	
	public Mammal(String size, String diet, int lifeExpectancy, String furOrHair, int numberOfLegs) {
		super(size, diet, lifeExpectancy);
		this.furOrHair = furOrHair;
		this.numberOfLegs = numberOfLegs;
	}
	
	public void stomp() {
		System.out.println("Stomping...");
	}

}
