package com.qa.firstApplication;

public class Taxes {

	public static void main(String[] args) {
		System.out.println(tax(50000));
	}
	
	public static String tax(int a) {
		if (a>=0 && a<=14999) {
			return "0% tax totalling: " + 0*a;
		} else if (a>=15000 && a<=19999){
			return "10% tax totalling: " + 0.1*a;
		} else if (a>=20000 && a<=29999) {
			return "15% tax totalling: " + 0.15*a;
		} else if (a>=30000 && a<= 44999) {
			return "20% tax totalling: " + 0.2*a;
		} else if (a>=45000) {
			return "25% tax totalling: " + 0.25*a;
		} else {
			return "not a valid number";
		}
	}
}
