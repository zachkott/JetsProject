package com.skilldistillery.jets.entities;

// Cargo jet is child class of Jet that inherits all fields from jet as well as implements an interface specific to cargo jets
public class CargoJet extends Jet implements cargoCarrier {

	// ctor with inherited fields from parent class
	public CargoJet(String type, String model, double speed, long price, int range) {
		super(type, model, speed, price, range);

	}

	public CargoJet() {
		super();
	}
}