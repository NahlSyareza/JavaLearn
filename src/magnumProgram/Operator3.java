package magnumProgram;

import java.util.Scanner;

@SuppressWarnings({"resource"})
public class Operator3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		if(a < 2) {
			System.out.println("Rana");
		} else if (a < 1) {
			System.out.println("Mana");
		} else if (a < 3) {
			System.out.println("Dana");
		}
	}

}
