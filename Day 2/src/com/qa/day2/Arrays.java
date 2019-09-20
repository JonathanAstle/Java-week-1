package com.qa.day2;

//Arrays are immutable size
public class Arrays {

	public static void main(String[] args) {
		String[] row = {"Jon", "Dave", "Liam", "John"};
		
		//first way of doing it
		System.out.println("print each element in this row sequentially");
		for (int i = 0; i<row.length; i++) {
			System.out.println(row[i]);
		}
		
		//second way of doing it - this is better
		System.out.println("for each *person* in this row, print them");
		for (String person: row) {
			System.out.println(person);
		}
	} 
}