package com.qa.Polymorphism;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Cat eric = new Cat("Eric", 5);
		
		//for the case where the cat isn't assigned a name it uses the second constructor in Cat
		Cat stray = new Cat(6);
		
		//System.out.println(stray.name); //prints null
		
		ArrayList<Cat> catsList = new ArrayList<Cat>();
		catsList.add(eric);
		catsList.add(stray);
		
		for (Cat c: catsList) {
			if (c.getName() != null) {
				System.out.println("This cat has is called " + c.getName() + " and is " + c.getAge() + " years old.");
			} else {
				System.out.println("This cat does not have a name and is " + c.getAge() + " years old.");
			}
			
		}
	}

}
