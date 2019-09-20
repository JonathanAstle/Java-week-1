package com.qa.Abstraction;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();

		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(cat);
		animals.add(dog);
		
		for (Animal a: animals) {
			a.speak();
			a.eat();
		}
	}

}
