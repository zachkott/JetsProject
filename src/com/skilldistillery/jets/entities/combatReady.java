package com.skilldistillery.jets.entities;

public interface combatReady {
	
	// Interface to be implemented by all Fighter Jets
	public default void fight() {
		System.out.println("Fighter jets to battle stations...");
		System.out.println("Fighter jets get ready for takeoff...");
		System.out.println("3...");
		System.out.println("2...");
		System.out.println("1...");
		System.out.println("DOGFIGHT!!!");
		System.out.println();

	}

}
