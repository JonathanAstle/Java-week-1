package com.qa.OOP;

public class JuliusCheeser {

	public static void main(String[] args) {
		Mouse juliusCheeser = new Mouse();
		//the below would not work because belly is set to *private* 
		//juliusCheeser.belly="bloated";
		//we can only interact with belly with eat() or crap()
		//belly can now only take two values: "full" or "empty"
		//this is *encapsulation*
		
		/* 
		We have four access modifiers
		 			public, protected, default, private
		 			See image below
		 			https://www.programcreek.com/wp-content/uploads/2011/11/access-level.png
		 */
		
		System.out.println(juliusCheeser.getBelly());
		juliusCheeser.eat();
		System.out.println(juliusCheeser.getBelly());
		juliusCheeser.crap();
		System.out.println(juliusCheeser.getBelly());
		
		juliusCheeser.setBelly("bloated");
		juliusCheeser.setBelly("full");
	}

}
