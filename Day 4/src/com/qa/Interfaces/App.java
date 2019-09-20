package com.qa.Interfaces;

public class App {

	public static void main(String[] args) {
		
		Bird bird = new Bird();
		
		bird.eat();
		bird.fly();
		bird.preen();
		
		FlyingCreature fcBird = new Bird();
		//fcBird has been cast to be a FlyingCreature so it can only fly
		//fcBird.eat();
		fcBird.fly();
		
		Hairy hairyBird = new Bird();
		//hairyBird.fly();
		hairyBird.preen();
	}

}
