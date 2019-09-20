package com.qa.Polymorphism_overriding;

public class Cat extends Animal {
	public void speak() {
		//here we have *overridden* the speak() method inherited from Animal
		System.out.println("meow");
		//so when we call the speak() method in App, it will print "meow", not "roar"
	}
}