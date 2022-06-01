package magnumProgram;

import java.util.Scanner;

@SuppressWarnings("resource")
public class MagnumProgram {
	
	static String username;

	public static void main(String[] args) {

		System.out.println("Data Generator Starting");
		
		mainMenu();
		
	}
	
	public static void mainMenu() {
	
		Scanner input = new Scanner(System.in);

		String stringInput = input.nextLine();
		
		switch (stringInput) {
		case "Enter":
			System.out.println("Entering the database");
			userDatabase();
			
			break;
		default:
			mainMenu();
		}
		
	}

	public static void userDatabase() {
		System.out.println("Welcome to the database");
		
		Scanner input = new Scanner(System.in);

		String stringInput = input.nextLine();
		
		username = stringInput;
		
	}
	
}
