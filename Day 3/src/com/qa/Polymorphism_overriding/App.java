package com.qa.Polymorphism_overriding;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Animal cat = new Cat(); // this is a quicker way of upcasting 
		
		//This is how we've previously done it:
		
		/*
		Cat cat = new Cat();
		Animal animalCat = (Animal) cat;
		*/
		
		Animal dog = new Dog();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(cat);
		animals.add(dog);
		
		for (Animal a: animals) {
			a.speak(); //neither roars because meow and bork have overriden speak() in Animal class
		}
	}

}
