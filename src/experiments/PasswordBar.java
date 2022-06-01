package experiments;

import java.util.Scanner;

// It returns back to the register

class PasswordTyper {

	static Scanner input = new Scanner(System.in);

	static String getUsername;
	
	public static String register() {
		String line1 = input.nextLine();

		
		if (line1.equals("Eszaray")) {
			System.out.println("Hello Eszaray, please type your password");
			getUsername = "Eszaray";
			passwordGlobal();
		} else if (line1.equals("Marcus")) {
			System.out.println("Hello Marcus, please type your password");
			passwordGlobal();
		} else {
			System.out.println("Unknown ID");
			register();
		}

		return line1;
	}

	public static void passwordGlobal() {
		String passwordLine = input.nextLine();

		if (passwordLine.equals("1234") && getUsername.equals("Eszaray")) {
			System.out.println("Welcome back, Eszaray!");
			System.out.println("What do you want to do today?");
			dataEszaray();
		} else if (passwordLine.equals("Back")) {
			System.out.println("Welcome to the registry! Please type your ID");
			register();
		} else {
			System.out.println("Wrong password");
			passwordGlobal();
		}
	}

	public static void dataEszaray() {
		String line1 = input.nextLine();

		if (line1.equals("Sign Out")) {
			System.out.println("Signed Out Eszaray!");
			System.out.println("Welcome to the Registry! Please type your ID");
			register();
		} else {
			System.out.println("Sorry, you can't do that");
			dataEszaray();
		}
	}

}

public class PasswordBar {

	public static void main(String[] args) {

		System.out.println("Welcome to the Registry! Please type your ID");
		PasswordTyper.register();

	}
}