package com.qa.OOP;

public class Rocklover extends Penguin {
	public String music;
	
	public Rocklover(String fluffiness, String music) {
		//fluffiness is required for the class penguin which Rocklover is a type of
		super(fluffiness);
		this.music = music;
	}
	
	public void dance() {
		System.out.println("tap tap");
	}
}