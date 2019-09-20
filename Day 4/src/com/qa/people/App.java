package com.qa.people;

public class App {

	public static void main(String[] args) {
		Person peter = new Person("Peter", 15);
		Person david = new Person("David", 69);
		Person paul = new Person("Paul", 12);
		
		for (Person person: Person.people) {
			System.out.println(person.name);
		}

	}

}