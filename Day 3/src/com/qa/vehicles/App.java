package com.qa.vehicles;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Car brum = new Car(37459287, 4);
		
		System.out.println("ID: " + brum.getId() +"   Wheels: " + brum.getWheels());
		brum.setWheels(3);	
		System.out.println("ID: " + brum.getId() +"   Wheels: " + brum.getWheels());
		
		Motorbike jenny = new Motorbike(11749975, 120);
		
		System.out.println("ID: " + jenny.getId() +"   BHP: " + jenny.getBhp());
		jenny.setBhp(135);
		System.out.println("ID: " + jenny.getId() +"   BHP: " + jenny.getBhp());
		
		//we can cast a class to be treated as its super class
		//casting brum the *car* as a *vehicle*:
		Vehicle vehBrum = (Vehicle) brum;
		//this is called upcasting
		
		System.out.println(vehBrum.getId());
		
		//the below gives an error because getWheels() is a method of the *car* class
		//System.out.println(vehBrum.getWheels());
		
		//equally we can downcast
		Car brumAgain = (Car) brum;
		//brumAgain has access to same methods as brum 
		//but this is generally considered bad practice because we could try and downcast to (wrong class) motorbike which would error
		
		System.out.println(brumAgain.getWheels()); //no error
		
		Vehicle vehJenny = (Vehicle) jenny;
		//jenny and brum have now both been cast as vehicles so we can treat them the same
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(vehBrum);
		vehicles.add(vehJenny);
		
		for (Vehicle vehicleName: vehicles) {
			System.out.println(vehicleName);
			System.out.println(vehicleName.getId());
		}
		
		for (Vehicle v: vehicles) {
			if (v instanceof Car) {
				System.out.println("This is a car with " + ((Car) v).getWheels() + " wheels.");
			} else if (v instanceof Motorbike) {
				System.out.println("This is a motorbike with a BHP of: " + ((Motorbike) v).getBhp());
			} else {
				System.out.println("This is neither a motorbike, nor a car");
			}
		}
	}

}
