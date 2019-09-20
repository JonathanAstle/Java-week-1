package com.qa.firstApplication;

public class Iteration {

	public static void main(String[] args) {
		//for (used when we know how many times it will go round)
		System.out.println("Now starting for loop");
		for (int i = 1 ; i<=5 ; i++) {
			System.out.println("I am line "+i);
		}
		
		//while (used when we don't know when it will end)
		System.out.println("Now starting while loop");
		int line = 1;
		while (line<=5) {
			System.out.println("I am line " + line++);
		}
	}
}