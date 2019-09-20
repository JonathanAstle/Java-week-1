package com.qa.Inheritance_exercise;

public class Animal {
	public void eat() {
		System.out.println("eating...");
	}
	public void sleep() {
		System.out.println("sleeping...");
	}
	
	public String size;
	public String diet;
	public int lifeExpectancy;
	
	public Animal(String size, String diet, int lifeExpectancy) {
		this.size = size;
		this.diet = diet;
		this.lifeExpectancy = lifeExpectancy;
	}
}
