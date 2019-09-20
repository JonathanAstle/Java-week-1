package com.qa.OOP;

public class Pingu {

	public static void main(String[] args) {
		Penguin pingu = new Penguin("very fluffy");
		//These two have been inherited from the animal class from the "extends animal" in the penguin class
		pingu.sleep();
		pingu.eat();
		//only swim was inherited from the penguin class
		pingu.swim();
		
		Rocklover rockLoverNick = new Rocklover("pretty fluffy", "metal");
		System.out.println(rockLoverNick.fluffiness);
		System.out.println(rockLoverNick.music);
	}
//This is *Inheritance* 
}
