package com.qa.OOP;

public class BobaFetch {

	public static void main(String[] args) {
		Dog bobaFetch = new Dog("Boba Fetch", "green");
		System.out.println(bobaFetch.name);
		
		Dog chewbarka = new Dog("Chewbarka", "brown");
		System.out.println(chewbarka.name);
		System.out.println(chewbarka.colour);
		
		chewbarka.fetch();
		
		System.out.println(chewbarka.name + " has the ball: " + chewbarka.hasBall);
		System.out.println(bobaFetch.name + " has the ball: " + bobaFetch.hasBall);
		
		chewbarka.dropIt();
		
		System.out.println(chewbarka.name + " has the ball: " + chewbarka.hasBall);
		
	}
}
