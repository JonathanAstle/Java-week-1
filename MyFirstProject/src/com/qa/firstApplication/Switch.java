package com.qa.firstApplication;

public class Switch {

	public static void main(String[] args) {
		String day = "Wednesday";
		switch (day) {
		case "Monday":
			System.out.println("I hate Mondays");
			break;
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			System.out.println("Work");
			break;
		case "Saturday":
			System.out.println("Yoga");
			break;
		case "Sunday":
			System.out.println("Ballet");
			break;
		default:
			System.out.println("Eat");
		}

	}

}
