package com.qa.Inheritance_exercise;

public class CreatingObjects {

	public static void main(String[] args) {
		Reptile sam = new Reptile("long", "carnivore", 17, "snake");
		
		System.out.println(sam.size);
		System.out.println(sam.diet);
		System.out.println(sam.lifeExpectancy);
		System.out.println(sam.snakeOrLizard);
		
		Bird albi = new Bird("6ft", "fish", 12, "Albatross", "white");

		System.out.println(albi.size);
		
		Mammal manny = new Mammal("huge", "herbivore", 80, "fingers", 4);
		
		System.out.println(manny.furOrHair);

	}

}
