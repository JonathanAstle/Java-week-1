package com.qa.Inheritance_exercise;

public class Bird extends Animal {
	public String name;
	public String colour;
	
	public Bird(String size, String diet, int lifeExpectancy, String name, String colour) {
		super(size, diet, lifeExpectancy);
		this.name = name;
		this.colour = colour;
	}
	
	public void fly() {
		System.out.println("Flying...");
	}
	
	public void peck() {
		System.out.println("Pecking...");
	}
}
