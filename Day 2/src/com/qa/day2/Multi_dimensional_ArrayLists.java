package com.qa.day2;

import java.util.ArrayList;

public class Multi_dimensional_ArrayLists {

	public static void main(String[] args) {
	
		int x = 25;
		
		System.out.println(Math.sqrt(x));
		
		//This commented out bit is a two dimensional ArrayList
		ArrayList<ArrayList<Integer>> Class = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			numbers.add(i);
		}
		numbers.set(0, 5);
		
		System.out.println(numbers);
		
		Class.add(numbers);
		Class.add(numbers);
		Class.add(numbers);
		Class.add(numbers);
		
		System.out.println(Class);
		
		System.out.println(Class.get(0));
		
		
		/*ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(3);
		marks.add(50);
		marks.add(77);		
		marks.add(64);
		
		System.out.println(marks);
		
		//remove based on objects matching
		marks.remove((Object) 50);

		System.out.println(marks); */
	}

}
