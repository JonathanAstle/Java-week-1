package com.qa.day2;

import java.util.ArrayList;

//An ArrayList has mutable size - arrays are immutable
public class Array_Lists {

	public static void main(String[] args) {
		ArrayList<String> row = new ArrayList<String>();
		row.add("Rory");
		System.out.println(row.size());
		row.add("Jon");
		System.out.println(row.size());
		row.add("Liam");
		System.out.println(row.size());
		
		System.out.println("printing whole list array");
		for (String person: row) {
			System.out.println(person);
		}
		
		System.out.println("printing index 1");
		System.out.println(row.get(1));
		
		System.out.println("removing index 1");
		row.remove(1);
		//when index 1 is removed, the item at index 2 is reassigned to index 1 -> there are no empty spaces in an ArrayList
		System.out.println("printing index 1");
		System.out.println(row.get(1));
	}

}
