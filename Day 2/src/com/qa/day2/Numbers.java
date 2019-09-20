package com.qa.day2;

public class Numbers {

	public static void main(String[] args) {
		System.out.println("the sum of the digits is " + SumDigits(1121));
		System.out.println(StringRep(1311));
	}
	
	public static int SumDigits(int a) {
		int thousands = (a-(a%1000))/1000;
		
		a = a - 1000*thousands;
		int hundreds = (a-(a%100))/100;
		
		a = a - 100*hundreds;
		int tens = (a-(a%10))/10;
		
		int units = a%10;
		
		return thousands + hundreds + tens + units;
	}
	
	public static String StringRep(int a) {
		int thousands = (a-(a%1000))/1000;
		
		a = a - 1000*thousands;
		int hundreds = (a-(a%100))/100;
		
		a = a - 100*hundreds;
		int tens = (a-(a%10))/10;
		
		int units = a%10;
		
		String stringThousands;
		String stringHundreds;
		String stringTens;
		String stringUnits;
		
		if (thousands == 9) {
			stringThousands = "nine thousand";
		} else if (thousands == 8) {
			stringThousands = "eight thousand";
		} else if (thousands == 7) {
			stringThousands = "seven thousand";
		} else if (thousands == 6) {
			stringThousands = "six thousand";
		} else if (thousands == 5) {
			stringThousands = "five thousand";
		} else if (thousands == 4) {
			stringThousands = "four thousand";
		} else if (thousands == 3) {
			stringThousands = "three thousand";
		} else if (thousands == 2) {
			stringThousands = "two thousand";
		} else {
			stringThousands = "one thousand";
		}
		
		if (hundreds == 9) {
			stringHundreds = "nine hundred";
		} else if (hundreds == 8) {
			stringHundreds = "eight hundred";
		} else if (hundreds == 7) {
			stringHundreds = "seven hundred";
		} else if (hundreds == 6) {
			stringHundreds = "six hundred";
		} else if (hundreds == 5) {
			stringHundreds = "five hundred";
		} else if (hundreds == 4) {
			stringHundreds = "four hundred";
		} else if (hundreds == 3) {
			stringHundreds = "three hundred";
		} else if (hundreds == 2) {
			stringHundreds = "two hundred";
		} else {
			stringHundreds = "one hundred";
		}
		
		if (tens == 9) {
			stringTens = "ninety";
		} else if (tens == 8) {
			stringTens = "eighty";
		} else if (tens == 7) {
			stringTens = "seventy";
		} else if (tens == 6) {
			stringTens = "sixty";
		} else if (tens == 5) {
			stringTens = "fifty";
		} else if (tens == 4) {
			stringTens = "fourty";
		} else if (tens == 3) {
			stringTens = "thirty";
		} else if (tens == 2) {
			stringTens = "twenty";
		} else {
			stringTens = "ten";
		}
		
		if (units == 9) {
			stringUnits = "nine";
		} else if (units == 8) {
			stringUnits = "eight";
		} else if (units == 7) {
			stringUnits = "seven";
		} else if (units == 6) {
			stringUnits = "six";
		} else if (units == 5) {
			stringUnits = "five";
		} else if (units == 4) {
			stringUnits = "four";
		} else if (units == 3) {
			stringUnits = "three";
		} else if (units == 2) {
			stringUnits = "two";
		} else {
			stringUnits = "one";
		}
	
		//unfinished
		return stringThousands + " " + stringHundreds + " and " + stringTens + "-" + stringUnits;
	}


}
