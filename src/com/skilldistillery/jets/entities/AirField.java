package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {

	Scanner sc = new Scanner(System.in);
	private List<Jet> fleet = new ArrayList<Jet>();

	@SuppressWarnings("unused")
	private Jet jet;

	public AirField() {
	}

	public List<Jet> getJetsFromFile() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.csv"))) {

			String line;

			while ((line = bufIn.readLine()) != null) {
				String[] splitLine = line.split(",");
				String type = splitLine[0];
				String model = splitLine[1];
				double speed = Double.parseDouble(splitLine[2]);
				long price = Long.parseLong(splitLine[3]);
				int range = Integer.parseInt(splitLine[4]);

				if (type.equalsIgnoreCase("Fighter")) {
					FighterJet fightJet = new FighterJet(type, model, speed, price, range);
					fleet.add(fightJet);

				} else if (type.equalsIgnoreCase("Cargo")) {
					CargoJet cargoJet = new CargoJet(type, model, speed, price, range);
					fleet.add(cargoJet);

				} else if (type.equalsIgnoreCase("Passenger")) {
					Passenger passJet = new Passenger(type, model, speed, price, range);
					fleet.add(passJet);

				} else if (type.equalsIgnoreCase("UFO")) {
					UFO ufo = new UFO(type, model, speed, price, range);
					fleet.add(ufo);
				}

			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return fleet;
	}

	public void fastestJet() {
		double topSpeed = 0.0;
		String thisJet = "";
		for (Jet jet : fleet) {
			if (jet != null) {
				if (jet.getSpeed() > topSpeed) {
					topSpeed = jet.getSpeed();
					thisJet = jet.getModel();
				}

			}
		}
		System.out.println("The fastest jet in the fleet is " + thisJet + ", with a top speed of " + topSpeed + "mph");
		System.out.println();
	}

	public void longestRange() {
		int longRange = 0;
		String thisJet = "";
		for (Jet jet : fleet) {
			if (jet.getRange() > longRange) {
				longRange = jet.getRange();
				thisJet = jet.getModel();
			}
		}
		System.out.println("The jet with the longest range is " + thisJet + ", with a maximum range of " + longRange
				+ " nautical miles");
		System.out.println();
	}

	public void fly() {
		for (Jet jet : fleet) {
			System.out.println(jet);
			jet.fly();
		}

	}

	public void addJets() {
		String type = "";
		String model = "";
		double speed = 0.0;
		long price = 0;
		int range = 0;

		// add menu here explaining what info the user will need in order to enter a new
		// aircraft

		System.out.println("Please enter the type of aircraft you would like to add.");
		System.out.println("Fighter, Cargo, Passenger, UFO");
		type = sc.next();

		if (type.equalsIgnoreCase("Fighter") || type.equalsIgnoreCase("Cargo") || type.equalsIgnoreCase("Passenger")
				|| type.equalsIgnoreCase("UFO")) {

			System.out.println("What is the model of your " + type + " jet?");
			model = sc.next();
			System.out.println("What is the maximum speed for the " + model + "? (mph)");
			speed = sc.nextDouble();
			System.out.println("How much does the " + model + " cost? (usd)");
			price = sc.nextLong();
			System.out.println("What is the maximum range of the " + model + "? (nautical miles)");
			range = sc.nextInt();
			System.out.println();
		} else {
			System.out.println("Invalid aircraft type. Returning to menu...");
		}

		if (type.equalsIgnoreCase("Fighter")) {
			this.fleet.add(new FighterJet(type, model, speed, price, range));
			System.out.println("Excellent! Your Fighter jet has been added to the fleet.");
			System.out.println();

		} else if (type.equalsIgnoreCase("Cargo")) {
			this.fleet.add(new CargoJet(type, model, speed, price, range));
			System.out.println("Excellent! Your Cargo jet has been added  to the fleet.");
			System.out.println();

		} else if (type.equalsIgnoreCase("Passenger")) {
			this.fleet.add(new Passenger(type, model, speed, price, range));
			System.out.println("Excellent! Your Passenger jet has been added to the fleet.");
			System.out.println();

		} else if (type.equalsIgnoreCase("UFO")) {
			this.fleet.add(new UFO(type, model, speed, price, range));
			System.out.println("Excellent! Your UFO has been added to the fleet.");
			System.out.println();

		}

	}

	public void removeJet() {

		System.out.println("Please choose the number that corresponds to the jet you would like to remove");
		System.out.println();
		int choice = sc.nextInt();
		if (choice > fleet.size()) {
			System.out.println("Invalid response.");

		} else {
			fleet.remove(choice - 1);
			System.out.println(choice + " has been removed");
			System.out.println();
			System.out.println("** Updated fleet list **");

		}

	}

	public void cargoLoader() {
		for (Jet jet : fleet) {
			if (jet instanceof CargoJet) {
				CargoJet cj = (CargoJet) jet;
				System.out.println(cj.toString());
				cj.loadCargo();
			}
		}

	}

	public void dogfight() {
		for (Jet jet : fleet) {
			if (jet instanceof FighterJet) {
				FighterJet fj = (FighterJet) jet;
				System.out.println(fj.toString());
				fj.fight();
			}
		}
	}

	public void phoneHome() {
		for (Jet jet : fleet) {
			if (jet instanceof UFO) {
				UFO et = (UFO) jet;
				System.out.println(et.toString());
				et.beamMeUp();
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder jetInfo = new StringBuilder();
		int index = 0;
		for (int i = 0; i < fleet.size(); i++) {
			jetInfo.append(index + 1).append(". ").append(fleet.get(index)).append("\n");
			index++;

		}
		return jetInfo.toString();
	}

}
