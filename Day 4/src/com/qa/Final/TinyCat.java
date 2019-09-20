package com.qa.Final;

public class TinyCat extends Kitten {
	//can override speak() because it's not final
	public void speak() {
		System.out.println("I am very small");
	}
	//cannot override eat() because it is final
	/*
	public final void eat() {
		System.out.println("Eating in tiny");
	}
	*/
}
