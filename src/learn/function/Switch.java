package learn.function;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type a database");
		String line1 = input.nextLine();
		
		switch(line1) {
		case "Legion" :
			System.out.println("A Legion consists of ten cohorts");
			
			// Basically returns this up, making an infinite loop
			Switch.main(args);
			break;
		
		case "Cohort" :
			System.out.println("Most cohorts consists of six centuries, except for the first cohort which consists of five double strength centuries");
			
			Switch.main(args);
			break;
			
			default :
			System.out.println("No database");
			
			Switch.main(args);
		}
		
	}

}
