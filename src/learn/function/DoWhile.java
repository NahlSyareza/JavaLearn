package learn.function;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int value1 = 0;
		
		do {
			
			System.out.println("Task failed successfully");
			
			value1 = input.nextInt();
		}
		while (value1 != 100);
			
		System.out.println("Socii Equites Extraordinarii");
	}

}
