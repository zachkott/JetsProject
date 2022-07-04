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
				fastestJet();
				break;

			case 4:
				longestRange();
				break;

			case 5:
				loadCargo();
				break;

			case 6:
				dogfight();
				break;

			case 7:
				ufoReturn();
				break;

			case 8:
				addJet();
				break;

			case 9:
				removeJet();
				break;

			case 10:
				quitApp();
				break;

			default:
				System.out.println("Invalid input. Please try again.");
				break;
			}
			menu();
		} while (continueLoop);
	}

	public void menu() {
		System.out.println("///////////////////////////////////////////////////////");
		System.out.println("/                                                     /");
		System.out.println("/                  - Main Menu -                      /");
		System.out.println("/                                                     /");
		System.out.println("/   1: List fleet.                                    /");
		System.out.println("/   2: Fly all jets.                                  /");
		System.out.println("/   3: View fastest jet.                              /");
		System.out.println("/   4: View jet with longest range.                   /");
		System.out.println("/   5: Load all Cargo Jets.                           /");
		System.out.println("/   6: Dogfight!                                      /");
		System.out.println("/   7: Phone home.                                    /");
		System.out.println("/   8: Add a jet to fleet.                            /");
		System.out.println("/   9: Remove a jet from fleet.                       /");
		System.out.println("/   10: Quit the program                              /");
		System.out.println("/                                                     /");
		System.out.println("///////////////////////////////////////////////////////");
		System.out.println();

	}

	public void listJets() {
		System.out.println(af.toString());
	}

	public void flyJets() {
		af.fly();

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

	public void addJet() {
		af.addJets();
		System.out.println(af.toString());

	}

	public void removeJet() {
		System.out.println(af.toString());
		af.removeJet();
		System.out.println(af.toString());
	}

	public void quitApp() {
		System.out.println("Thank you for stopping by the Area 69 air base. We hope you enjoyed your stay!");
		System.exit(0);
	}

}
