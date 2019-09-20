package com.qa.firstApplication;

public class UniqueSum {

	public static void main(String[] args) {
		System.out.println(UniqqueSum(1,1,2));
	}

	public static int UniqqueSum(int a, int b, int c) {
		int total = 0;
		if (a != b && a != c) {
			total = total+a;
		}
		if (b != a && b != c) {
			total = total + b;
		}
		if (c != a && c != b) {
			total = total + c;
		}
		return total;
	}
}
