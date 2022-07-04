package com.skilldistillery.jets.entities;

public interface cargoCarrier {

	// Interface to be implemented by all Cargo Jets
	public default void loadCargo() {
		System.out.println("All cargo planes begin loading...");
		System.out.println("Halfway done loading plane...");
		System.out.println("Loading complete.");
		System.out.println();
	}

}
