package com.qa.Calculator;

public class Calculator2 {

	public static void main(String[] args) {
		int[] numbers = {2,4,6,3};
		
		for (int n: numbers) {
			for (int m: numbers) {
				if (n==m) {
					continue;
				}
				for (int b: numbers) {
					if (n+m==b) {
						System.out.println(n + "+" + m + "=" + b);
					} else if (n-m==b) {
						System.out.println(n + "-" + m + "=" + b);
					} else if (n*m==b) {
						System.out.println(n + "*" + m + "=" + b);
					} else if (n/m==b) {
						System.out.println(n + "/" + m + "=" + b);
					}
				}
			}
		}
		
		

	}

}
