package com.qa.firstApplication;

public class Conditionals {

	public static void main(String[] args) {
		System.out.println(conditional(1,1,true));
	}
	
	public static int conditional(int a, int b, boolean c) {
		if (c==true) {
			return a+b;
		} else {
			return a*b;
		}
	}

}
