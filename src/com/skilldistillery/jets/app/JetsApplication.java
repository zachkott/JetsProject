package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {
	private AirField af = new AirField();

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.af.getJetsFromFile();
		ja.run();
	}

	public void run() {

		menu();
		boolean continueLoop = true;

		
		// This do while loop will continue until the user enters 11.
		// The menu will be displayed after each user input until the loop is broken
		do {

			System.out.println("Please choose an option from the menu.");
			int menuOption = sc.nextInt();
			System.out.println();

			switch (menuOption) {
			case 1:
				listJets();
				System.out.println();
				break;

			case 2:
				flyJets();
				break;

			case 3:
				flyThisJet();
				break;

			case 4:
				fastestJet();
				break;

			case 5:
				longestRange();
				break;

			case 6:
				loadCargo();
				break;

			case 7:
				dogfight();
				break;

			case 8:
				ufoReturn();
				break;

			case 9:
				addJet();
				break;

			case 10:
				removeJet();
				break;

			case 11:
				quitApp();
				break;

			default:
				System.out.println("Invalid input. Please try again.");
				break;
			}
			menu();
		} while (continueLoop);
	}

	// This is the method that will be called when the user opens the app
	public void menu() {
		System.out.println("///////////////////////////////////////////////////////");
		System.out.println("/                                                     /");
		System.out.println("/                  - Main Menu -                      /");
		System.out.println("/                                                     /");
		System.out.println("/   1: List fleet.                                    /");
		System.out.println("/   2: Fly all jets.                                  /");
		System.out.println("/   3: Fly single jet.                                /");
		System.out.println("/   4: View fastest jet.                              /");
		System.out.println("/   5: View jet with longest range.                   /");
		System.out.println("/   6: Load all Cargo Jets.                           /");
		System.out.println("/   7: Dogfight!                                      /");
		System.out.println("/   8: Phone home.                                    /");
		System.out.println("/   9: Add a jet to the fleet.                        /");
		System.out.println("/   10: Remove a jet from fleet.                      /");
		System.out.println("/   11: Quit the program                              /");
		System.out.println("/                                                     /");
		System.out.println("///////////////////////////////////////////////////////");
		System.out.println();

	}

	// User story #1 this method prints the toString with all data on the fleet
	public void listJets() {
		System.out.println(af.toString());
	}

	public void flyJets() {
		af.fly();

	}

	public void flyThisJet() {
		af.flyThis();
	}

	public void fastestJet() {
		af.fastestJet();
	}

	public void longestRange() {
		af.longestRange();
	}

	public void loadCargo() {
		af.cargoLoader();
	}

	public void ufoReturn() {
		af.phoneHome();
	}

	public void dogfight() {
		af.dogfight();
	}

	// Added the toString to show an updated list after the user adds a jet to the
	// fleet
	public void addJet() {
		af.addJets();
		System.out.println(af.toString());

	}

	// Added the toString to show an updated list after the user has removed a jet
	// from the fleet
	public void removeJet() {
		System.out.println(af.toString());
		af.removeJet();
		System.out.println(af.toString());
	}

	// This method will be called when the user enters 11 in the main menu
	public void quitApp() {
		System.out.println("Thank you for stopping by the Area 69 air base. We hope you enjoyed your stay!");
		System.exit(0);
	}

}
