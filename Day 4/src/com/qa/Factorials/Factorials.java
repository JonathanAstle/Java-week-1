package com.qa.Factorials;

public class Factorials {

	public static void main(String[] args) {
		double number = 6;
		
		int i = 0;
		while (number != 1) {
			number = number / (i+1);
			i++;
			
			if (number < 1) {
				System.out.println("NONE!");
				break;
			} else if (number == 1) {
				System.out.println(i+"!");
			}
		}
	}
}