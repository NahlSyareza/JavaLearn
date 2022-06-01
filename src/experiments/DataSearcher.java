package experiments;

import java.util.Scanner;

class DataGet {

	Scanner input = new Scanner(System.in);

	String line1;

	public void getInputFromUser() {

		String command = input.nextLine();

		if (command.equals("One")) {
			System.out.println("One's database");
			getOne();
		} else if (command.equals("Two")) {
			System.out.println("Two's database");
			getTwo();
		} else if (command.equals("Three")) {
			System.out.println("Three's database");
			getThree();
		} if (command.equals("Ten")) {
			System.out.println("Ten's database");
			getTen();
		} else {
			System.out.println("Number not yet registered");
			getInputFromUser();
		}
	}

	public void getOne() {

		String command = input.nextLine();

		if (command.equals("Get data") || command.equals("get data") || command.equals("Get Data")) {
			System.out.println("One is the earliest among the Quintilis Kingdom");
			getOne();
		} else if (command.equals("Notable Persons") || command.equals("Notable Person")) {
			System.out.println("Notable persons of the status One");
			System.out.println("Aeneas, Romulus, Remus, Marcus Junius Brutus, Lucius Julius Libo");
			getOne();
		} if (command.equals("Back")) {
			System.out.println("Welcome to the registry");
			getInputFromUser();
		} else if (command.equals("Help")) {
			System.out.println("Type 'Get data' to get the data");
			System.out.println("Type 'Notable Persons' to get notable persons of this status");
			System.out.println("Type 'Back' to go back to the Registry");
			getOne();
		} else {
			System.out.println("Nothing found, type 'Help' to get available commands");
			getOne();
		}
	}
	
	public void getThree() {

		String command = input.nextLine();

		if (command.equals("Get data") || command.equals("get data") || command.equals("Get Data")) {
			System.out.println("Three is considered to be the poweful ones. With Two, Three got so many great experiences on many things");
			getThree();
		} else if (command.equals("Notable Persons")) {
			System.out.println("Notable persons of the status Three");
			System.out.println("Marcus Junius Brutus, Lucius Cornelius Sulla, Marcus Aelius Decius");
			getThree();
		} if (command.equals("Back")) {
			System.out.println("Welcome to the registry");
			getInputFromUser();
		} else if (command.equals("Help")) {
			System.out.println("Type 'Get Data' to get the data");
			System.out.println("Type 'Notable Persons' to get notable persons of this status");
			System.out.println("Type 'Back' to go back to the Registry");
			getThree();
		} else {
			System.out.println("Nothing found, type 'Help' to get available commands");
			getThree();
		}
	}

	public void getTwo() {

		String command = input.nextLine();

		if (command.equals("Get data") || command.equals("get data") || command.equals("Get Data")) {
			System.out.println("Two is the wisest, learning from One's wisdom");
			getTwo();
		} else if (command.equals("Notable Persons")) {
			System.out.println("Notable persons of the status Two");
			System.out.println("Marcus Vipasnius Agrippa, Marcus Aurelius, Publius Aelius Hadrianus");
			getTwo();
		} if (command.equals("Back")) {
			System.out.println("Welcome to the registry");
			getInputFromUser();
		} else if (command.equals("Help")) {
			System.out.println("Type 'Get Data' to get the data");
			System.out.println("Type 'Notable Persons' to get notable persons of this status");
			System.out.println("Type 'Back' to go back to the Registry");
			getTwo();
		} else {
			System.out.println("Nothing found, type 'Help' to get available commands");
			getTwo();
		}
	}

	public void getTen() {

		String command = input.nextLine();

		if (command.equals("Get data") || command.equals("get data") || command.equals("Get Data")) {
			System.out.println("Ten is the highest among the Quintilis Kingdom");
			getTen();
		} else if (command.equals("Notable Persons")) {
			System.out.println("Notable persons of the status Three");
			System.out.println("Gaius Julius Caesar, Gaius Octavius, Lucius Domitius Aurelianus, Marcus Ulpius Traianus");
			getTen();
		} if (command.equals("Back")) {
			System.out.println("Welcome to the registry");
			getInputFromUser();
		} else if (command.equals("Help")) {
			System.out.println("Type 'Get Data' to get the data");
			System.out.println("Type 'Notable Persons' to get notable persons of this status");
			System.out.println("Type 'Back' to go back to the Registry");
			getTen();
		} else {
			System.out.println("Nothing found, type 'Help' to get available commands");
			getTen();
		}

	}

}

public class DataSearcher {

	public static void main(String[] args) {

		DataGet dataGet = new DataGet();

		System.out.println("Welcome to the registry");

		dataGet.getInputFromUser();

	}

}
