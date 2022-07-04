package com.skilldistillery.jets.entities;

// Fighter jet is child class of Jet that inherits all fields from jet as well as implements an interface specific to fighter jets

public class FighterJet extends Jet implements combatReady {

	public FighterJet(String type, String model, double speed, long price, int range) {
		super(type, model, speed, price, range);
		
	}

	public FighterJet() {
		super();
	}

}
