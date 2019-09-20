package com.qa.ToStringMethod;

public class Dog {
	public int age;
	public String name;
	
	public Dog(int age, String name) {
		this.age = age;
		this.name=name;
	}
	
	//@Override tells java everything underneath will override
	@Override
	public String toString() {
		return "age: " + age + "     name: " + name;
	}
}
