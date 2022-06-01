package hooke;

import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings({"resource"})
public class TypeLoop {

	public static void main(String[] args) {

		typeLoop();
		
	}

	public static void typeLoop() {
		Scanner input = new Scanner(System.in);

		String inLine = input.nextLine();

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("next");
		list.add("nexT");
		list.add("NEXT");
		list.add("nExT");
		
		for(String unListed : list) {
			System.out.println(unListed);
			
			if (inLine.contains(unListed)) {
				System.out.println("Hello, welcome");
				nextTypeLoop();
			} else {
				System.out.println("Try enter 'Next'");
				
			}
		}
		
	}

	public static void nextTypeLoop() {
		Scanner input = new Scanner(System.in);

		String inLine = input.nextLine();
		
		if(inLine.equals("Back")) {
			System.out.println("You are back here");
			typeLoop();
		} else nextTypeLoop();
	}

}
