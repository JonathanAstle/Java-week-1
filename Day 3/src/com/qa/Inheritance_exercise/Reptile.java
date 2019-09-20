package com.qa.Inheritance_exercise;

public class Reptile extends Animal {
	public String snakeOrLizard;
	
	public Reptile(String size, String diet, int lifeExpectancy, String snakeOrLizard) {
		super(size, diet, lifeExpectancy);
		this.snakeOrLizard = snakeOrLizard;
	}
	
	public void sunbathe() {
		System.out.println("sunbathing");
	}
}
