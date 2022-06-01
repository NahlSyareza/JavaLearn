package experiments;

import java.util.Scanner;

class Legions {

	Scanner input = new Scanner(System.in);

	public void mainRegistry() {
		String a = input.nextLine();

		if (a.equals("Roman Legions")) {
			System.out.println("Search for Legions");
			romanLegions();
		} else if (a.equals("Notable Romans")) {
			System.out.println("Search for some notable Romans");
			notableRomans();
		} else if (a.equals("Help")) {
			System.out.println("Available commands are : 'Notable Romans', 'Roman Legions'");
			mainRegistry();
		} else {
			System.out.println("Unknown command, type 'Help' to get the list of available commands");
			mainRegistry();
		}
	}

	public void romanLegions() {
		String a = input.nextLine();

		if (a.equals("Help")) {
			System.out.println("Available commands are : 'Back'");
			romanLegions();
		} else if (a.equals("Back")) {
			System.out.println("Welcome to the main registry");
			mainRegistry();
		} else {
			System.out.println("Unknown command, type 'Help' to get the list of available commands");
			romanLegions();
		}
	}

	public void notableRomans() {
		String a = input.nextLine();

		if (a.equals("Help")) {
			System.out.println("Available commands are : 'Back'");
			notableRomans();
		} else if (a.equals("Back")) {
			System.out.println("Welcome to the main registry");
			mainRegistry();
		} else {
			System.out.println("Unknown command, type 'Help' to get the list of available commands");
			notableRomans();
			;
		}
	}

}

public class RomanLegions {

	public static void main(String[] args) {

		Legions program = new Legions();

		System.out.println("Welcome to the main registry");

		program.mainRegistry();

	}
}
