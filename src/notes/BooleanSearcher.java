package notes;

import java.util.Scanner;

public class BooleanSearcher {
	
	Scanner input = new Scanner(System.in);
	
	public void register() {
		BooleanSearcher bS = new BooleanSearcher();
		
		String line1 = input.nextLine();
		
		boolean a = line1.equals("Marcus");
		boolean b = line1.equals("Gaius");
		
		if(a) {
			System.out.println("Hello Marcus");
			bS.register();
		} else if (b) {
			System.out.println("Hello Gaius");
			bS.register();
		} else {
			System.out.println("Registry not recognized");
			bS.register();
		}
		
	}
	
}
