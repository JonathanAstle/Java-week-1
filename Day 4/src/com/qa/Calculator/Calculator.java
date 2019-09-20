package com.qa.Calculator;

import java.util.ArrayList;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(Calc(9, 12, 108));
		
	}
	
	public static String Calc(int a, int b, int c) {
		ArrayList<String> additions = new ArrayList<String>();
		ArrayList<String> subtractions = new ArrayList<String>();
		ArrayList<String> multiplications = new ArrayList<String>();
		ArrayList<String> divisions  = new ArrayList<String>();
		
		if (a+b==c) {
			additions.add(a + "+" + b + "=" + c);
			additions.add(b + "+" + a + "=" + c);
			subtractions.add(c + "-" + b + "=" + a);
			subtractions.add(c + "-" + a + "=" + b);
		} if (b+c==a) {
			additions.add(b + "+" + c + "=" + a);
			additions.add(c + "+" + b + "=" + a);
			subtractions.add(a + "-" + b + "=" + c);
			subtractions.add(a + "-" + c + "=" + b);
		} if (c+a==b) {
			additions.add(c + "+" + a + "=" + b);
			additions.add(a + "+" + c + "=" + b);
			subtractions.add(b + "-" + a + "=" + c);
			subtractions.add(b + "-" + c + "=" + a);
		} if (a*b==c) {
			multiplications.add(a + "*" + b + "=" + c);
			multiplications.add(b + "*" + a + "=" + c);
			divisions.add(c + "/" + a + "=" + b);
			divisions.add(c + "/" + b + "=" + a);
		} if (b*c==a) {
			multiplications.add(b + "*" + c + "=" + a);
			multiplications.add(c + "*" + b + "=" + a);
			divisions.add(a + "/" + c + "=" + b);
			divisions.add(a + "/" + b + "=" + c);
		} if (a*c==b) {
			multiplications.add(a + "*" + c + "=" + b);
			multiplications.add(c + "*" + a + "=" + b);
			divisions.add(b + "/" + a + "=" + c);
			divisions.add(b + "/" + c + "=" + a);
		}
				
		String toReturn = "";
		
		for (String x: additions) {
			toReturn = toReturn + x + " ";
		}
		
		for (String x: subtractions) {
			toReturn = toReturn + x + " ";
		}
		
		for (String x: multiplications) {
			toReturn = toReturn + x + " ";
		}
		
		for (String x: divisions) {
			toReturn = toReturn + x + " ";
		}
		
		return toReturn;
	}
	
	
	
}
