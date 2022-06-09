package generator;

import java.util.Scanner;

public class ToolsForGeneratorMk2 {

	public static void main(String[] args) {
		containString();
	}
	
	public static void containString() {
		Scanner input = new Scanner(System.in);
		
		String nextLine = input.nextLine();
		
		String identifier = "SwordItem";
		
		if(nextLine.toUpperCase().indexOf(identifier.toUpperCase()) != -1) {
			System.out.println("True");
		} else System.out.println("False");
	}

	public static void looper() {
		int i;
		
		String typeGetter = new String();

		for (i = 0; i < 4; i++) {
			if(i == 0) {
				typeGetter = "Set Zero";
			} else if (i == 1) {
				typeGetter = "Set One";
			} else if (i == 2) {
				typeGetter = "Set Two";
			} else if(i == 3 ) {
				typeGetter = "Set Three";
			} 
			
			System.out.println(typeGetter);
		}
		
	}

}
