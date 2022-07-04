package com.skilldistillery.jets.entities;

// Passenger jet is child class of Jet that inherits all fields from jet as well as implements an interface specific to passenger jets
public class Passenger extends Jet{
	
	public Passenger() {
		super();
	}

	public Passenger(String type, String model, double speed, long price, int range) {
		super(type, model, speed, price, range);
		
	}

}
