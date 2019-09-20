package com.qa.ToStringMethod;

public class App {

	public static void main(String[] args) {
		Dog pup = new Dog(1, "pup");
		
		// toString() in the Dog class changes what is printed by sysout(pup)
		System.out.println(pup.toString());
		//both do the same thing
		System.out.println(pup);

	}

}
