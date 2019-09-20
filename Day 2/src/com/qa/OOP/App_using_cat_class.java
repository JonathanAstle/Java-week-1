package com.qa.OOP;

public class App_using_cat_class {

	public static void main(String[] args) {
		Cat maya = new Cat();
		maya.name = "Maya";
		maya.fur = "brown";
		
		Cat george = new Cat();
		george.name = "George";
		george.fur = "black";

		Cat jon = new Cat();
		jon.name = "Jon";
		jon.fur = "Golden";
		
		//initialisation
		Cat meowser;
		//instantiation - creating an instance of a class
		meowser = new Cat();
		meowser.name = "Meowser";
		meowser.fur = "ginger";
		
		
		//Just experimenting with RAM location
		System.out.println(jon);
		
		jon=meowser;
		System.out.println(jon);
		System.out.println(meowser);
		
		System.out.println(jon.name);
		
		jon.name = "other";
		System.out.println(meowser.name);
	}

}