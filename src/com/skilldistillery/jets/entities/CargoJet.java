package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements cargoCarrier {

	public CargoJet(String type, String model, double speed, long price, int range) {
		super(type, model, speed, price, range);

	}
	
	public CargoJet() {}
}