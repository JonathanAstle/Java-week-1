package com.qa.people;

import java.util.ArrayList;

public class Person {
	public String name;
	public int age;
	public static ArrayList<Person> people = new ArrayList<Person>();
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		people.add(this);
	}
}
