package com.qa.firstApplication;

public class App2 {
	public static void main(String[] args) {
		System.out.println(play(5,22));
	}
	
	public static int play(int a,int b) {
		if (a>b) {
			if (a<=21) {
				return a;
			} else if (b<=21) {
				return b;
			} else return 0;
		}
		else if (b>a) {
			if (b<=21) {
				return b;
			} else if (a<=21) {
				return a;
			} else {
				return 0;
			}
		}
		else {
			return a;
		}
	}
}