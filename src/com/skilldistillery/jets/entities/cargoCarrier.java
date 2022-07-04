package com.skilldistillery.jets.entities;

public interface cargoCarrier {
	public default void loadCargo() {
		System.out.println("All cargo planes begin loading...");
		System.out.println("Halfway done loading plane...");
		System.out.println("Loading complete.");
		System.out.println();
	}

}
