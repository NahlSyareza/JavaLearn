package learn.function;

import java.util.Scanner;

//Well I guess while functions can only be used with numbers

//So basically while runs the code from top to bottom systematically, put the Sys.out "Unknown description" at the top, and see what happens

public class While {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type to search");
		int value1 = input.nextInt();
		
		
		while(value1 < 100) {
			System.out.println("The value is less than 100");
			
			value1 = input.nextInt();
		}
		
		while (value1 > 100) {
			System.out.println("The value is greater than 100");
			
			value1 = input.nextInt();
		}
		
		System.out.println("Unknown description");
		
	}

}
