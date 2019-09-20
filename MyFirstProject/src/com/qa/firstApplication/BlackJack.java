package com.qa.firstApplication;

public class BlackJack {

	public static void main(String[] args) {
		System.out.println(play(18,551));
	}

	public static int play(int a,int b) {
		if (a>=b && a<=21) {
			return a;
		} else if (a>=b && b<=21) {
			return b;
		} else if (b>=a && b<=21) {
			return b;
		} else if (b>=a && a<=21) {
			return a;
		} else {
			return 0;
		}
	}
}
