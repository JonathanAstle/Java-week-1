package com.qa.OOP;
/* 
Four principles of OOP:
 		Encapsulation
 		Inheritance
 		Polymorphism
 		Abstraction
*/


public class Dog {
	public String name; 
	public String colour;
	public boolean hasBall = false;
	
	public void fetch() {
		System.out.println("playing fetch ... ");
		hasBall=true;
	}
	public void dropIt() {
		System.out.println("drop it ... ");
		hasBall=false;
	}
	//a Method whose name matches the class is called the constructor
	public Dog(String dogsName, String colour) {
		//if we use different variable names for the constructor and the object variable
		name = dogsName;
		//or we can use the same name, but we have to use "this." to avoid confusion between this "colour" and that "colour"
		this.colour = colour;
	}
}
