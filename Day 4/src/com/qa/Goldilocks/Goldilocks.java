package com.qa.Goldilocks;

public class Goldilocks {

	public static void main(String[] args) {
		int[] weightCapacity = {100, 30, 130, 90, 150, 120, 200, 110};
		int[] temp = {80, 50, 60, 60, 85, 70, 200, 100};
		
		int weight = 100;
		int maxTemp = 80;
		
		for (int i=0; i<weightCapacity.length; i++) {
			if (weightCapacity[i]>=weight && temp[i]<=maxTemp) {
				System.out.println(i+1);
			}
		}
	}

}
