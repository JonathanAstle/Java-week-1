package com.qa.day2;

public class Coins {

	public static void main(String[] args) {
		System.out.println(Change(4.58,35));
	}
	
	public static String Change(double cost, double paidWith) {
		String newline = System.getProperty("line.separator");
		
		double totalChange = paidWith-cost;
		System.out.println(totalChange);
		double numberOf20s = (totalChange/20) - (totalChange/20)%1;
		
		double remainingTotalChange = totalChange - numberOf20s*20;
		System.out.println(remainingTotalChange);
		double numberOf10s = (remainingTotalChange/10) - (remainingTotalChange/10)%1;

		remainingTotalChange = remainingTotalChange - numberOf10s*10;
		System.out.println(remainingTotalChange);
		double numberOf5s = (remainingTotalChange/5) - (remainingTotalChange/5)%1;
		
		remainingTotalChange = remainingTotalChange - numberOf5s*5;
		System.out.println(remainingTotalChange);
		double numberOf2s = (remainingTotalChange/2) - (remainingTotalChange/2)%1;
		
		remainingTotalChange = remainingTotalChange - numberOf2s*2;
		System.out.println(remainingTotalChange);
		double numberOf1s = (remainingTotalChange/1) - (remainingTotalChange/1)%1;
		
		remainingTotalChange = remainingTotalChange - numberOf1s*1;
		System.out.println(remainingTotalChange);
		double numberOf50ps = (remainingTotalChange/0.5) - (remainingTotalChange/0.5)%1;
				
		remainingTotalChange = remainingTotalChange - numberOf50ps*0.5;
		System.out.println(remainingTotalChange);
		double numberOf20ps = (remainingTotalChange/0.2) - (remainingTotalChange/0.2)%1;
		
		remainingTotalChange = remainingTotalChange - numberOf20ps*0.2;
		System.out.println(remainingTotalChange);
		double numberOf10ps = (remainingTotalChange/0.1) - (remainingTotalChange/0.1)%1;
		
		remainingTotalChange = remainingTotalChange - numberOf10ps*0.1;
		System.out.println(remainingTotalChange);
		double numberOf5ps = (remainingTotalChange/0.05) -(remainingTotalChange/0.05)%1;
		
		remainingTotalChange = remainingTotalChange - numberOf5ps*0.05;
		double numberOf2ps = (remainingTotalChange/0.02) - (remainingTotalChange/0.01)%1;
		
		remainingTotalChange = remainingTotalChange - numberOf2s*0.02;
		double numberOf1ps = (remainingTotalChange/0.01) - (remainingTotalChange/0.01)%1;
		
		return "Total Change to be given is: " + totalChange + newline
				+ numberOf20s + " £20 notes" + newline
				+ numberOf10s + " £10 notes" + newline
				+ numberOf5s + " £5 notes" + newline
				+ numberOf2s + " £2 coins" + newline
				+ numberOf1s + " £1 coins" + newline
				+ numberOf50ps + " 50p coins" + newline
				+ numberOf20ps + " 20p coins" + newline
				+ numberOf10ps + " 10p coins" + newline
				+ numberOf5ps + " 5p coins" + newline
				+ numberOf2ps + " 2p coins" + newline
				+ numberOf1ps + " 1p coins" + newline;
	}

}
