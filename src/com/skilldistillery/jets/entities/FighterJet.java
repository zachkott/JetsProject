package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements combatReady {

	public FighterJet(String type, String model, double speed, long price, int range) {
		super(type, model, speed, price, range);
		
	}

	public FighterJet() {}

}
