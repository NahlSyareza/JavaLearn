package magnumProgram;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Operator1 {
	
	public static void main(String[] args) {
		
		int[] numberArray = new int[5];
		
		numberArray[0] = 10;
		numberArray[1] = 20;
		numberArray[2] = 30;
		numberArray[3] = 40;
		numberArray[4] = 50;
		
		//	int[] numArray = {2, 3};
		
		Scanner input = new Scanner(System.in);
		
		int numberInput = input.nextInt();
		
		if(numberInput > 5 || numberInput < 1) {
			System.out.println(numberInput);
			main(args);
		}
		
		do {
			System.out.println(numberArray[numberInput - 1]);
			numberInput = 10;
			
			main(args);
		} while(!(numberInput > 5));
		
	}

}
