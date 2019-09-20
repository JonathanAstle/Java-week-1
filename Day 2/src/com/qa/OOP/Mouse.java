package com.qa.OOP;

public class Mouse {
	private String belly = "empty";
	
	public void eat() {
		System.out.println("Eating...");
		belly = "full";
	}
	public void crap() {
		System.out.println("crapping...");
		belly = "empty";
	}
	public String getBelly() {
		return belly;
	}
	
	public void setBelly(String belly) {
		if (belly.equals("full") || belly.equals("empty")) {
			this.belly = belly;
			System.out.println("You have set belly to " + belly);
		} else {
			System.out.println("You can only set belly to full or empty");
		}
	}
}
