package com.qa.oop;

public class OOP {

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
		
		System.out.println(jon.fur);
	}

}