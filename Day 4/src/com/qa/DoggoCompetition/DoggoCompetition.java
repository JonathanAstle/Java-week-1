package com.qa.DoggoCompetition;

public class DoggoCompetition {

	public static void main(String[] args) {
		int X=20;
		
		for (int i = 1; i<=100; i++) {
			if (i==X) {
				continue;
			} if (i==11) {
				System.out.println(i+"th");
			} else if (i==12) {
				System.out.println(i+"th");
			} else if (i==13) {
				System.out.println(i+"th");
			} else if (i%10 == 1) {
				System.out.println(i+"st");
			} else if (i%10 == 0 || i%10 >=4) {
				System.out.println(i+"th");
			} else if (i%10 == 2) {
				System.out.println(i+"nd");
			} else if (i%10 == 3) {
				System.out.println(i+"rd");
			}
			
		}

	}

}
