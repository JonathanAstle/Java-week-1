package com.qa.day2;

public class Iteration3 {

	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			for (int j=0; j<10; j++) {
				System.out.println(i);
			}
		}
		
		for (int i=1; i<=10; i++) {
			for (int j=0; j<i; j++) {
				System.out.println(i);
			}
		}

	}

}
