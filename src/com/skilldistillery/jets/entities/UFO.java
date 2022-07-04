package com.skilldistillery.jets.entities;

// UFO is child class of Jet that inherits all fields from jet as well as implements an interface specific to UFO's
public class UFO extends Jet implements mothership{

	public UFO() {
		super();
	
	}

	public UFO(String type, String model, double speed, long price, int range) {
		super(type, model, speed, price, range);
		
	}

	
}
