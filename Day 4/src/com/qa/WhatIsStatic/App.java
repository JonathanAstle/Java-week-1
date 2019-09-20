package com.qa.WhatIsStatic;

public class App {

	//static means that features are common across the whole class.
	//so putting a cat in box 1 means box 2 also gets a cat
	//avoid when you can
	
	public static void main(String[] args) {
		Box box = new Box();
		Box box2 = new Box();
		
		box.colour="Green";
		box.item="Cat";

		System.out.println(box2.item);
		System.out.println(box.item);
		
		//item belongs to a whole class not an instance of a class
		System.out.println(Box.item);
	}

}
