package learn.function;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type to search");
		String line1 = input.nextLine();
		
		if(line1.equals("Legion")) {
			System.out.println("A legion is a military unit that consists of 10 cohorts");
			System.out.println(" ");
			System.out.println("Type to search");
			//line1 = input.nextLine();
		}
		
		else if(line1.equals("Cohort")) {
			System.out.println("Most cohorts consists of 6 centuries, but the first cohort consists of 5 double strengthed centuries");
			System.out.println(" ");
			System.out.println("Type to search");
			//line1 = input.nextLine();
		}
		
		else {
			System.out.println("Can't find anything");
			System.out.println(" ");
			System.out.println("Type to search");
			//line1 = input.nextLine();
		}
	}

}
