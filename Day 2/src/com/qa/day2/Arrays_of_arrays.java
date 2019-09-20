package com.qa.day2;

public class Arrays_of_arrays {
	public static void main(String[] args) {
		String[] row1 = {"Alex", "Michael", "Chris"};
		String[] row2 = {"Holly", "Jack", "James"};
		String[] row3 = {"Jon", "Dave", "Liam"};
		
		String[][] wholeClass = {row1, row2, row3};
		
		//this is equivalent to all of the above:
		//String[][] wholeClass = {{"Alex", "Michael", "Chris"},{"Holly","Jack","James"},{"Jon","Dave","Liam"}}
		
		//these two methods produce the same result
		System.out.println("Using an inferior for loop");
		for (int i=0; i<wholeClass.length; i++) {
			for (int j=0; j<wholeClass[i].length; j++) {
				System.out.println(wholeClass[i][j]);
			}
		}
		
		//same result as previous
		System.out.println("Now using an enhanced for loop");
		for (String[] row: wholeClass) {
			for (String person: row) {
				System.out.println(person);
			}
		}
		
		//shows ram location for each array within wholeClass
		for (String[] row: wholeClass) {
			System.out.println(row);
		}
		
		//creates an empty classroom array with 5 rows and 6 people in each row
		String[][] classroom = new String[5][6];
		//prints what's in row 3 column 4 (currently nothing)
		System.out.println(classroom[3][4]);
		//adds to array
		classroom[3][4] = "Owen";
		System.out.println(classroom[3][4]);
	}
}