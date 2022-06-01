package magnumProgram;

public class Operator2 {

	public static void main(String[] args) {
		
		String[][] commandLine = new String[3][3];

		commandLine[1][1] = "String Line";

		for (int i = 0 ; i < commandLine.length ; i++) {
			for(int k = 0 ; k < commandLine.length ; k++) {
				System.out.println(commandLine[i][k]);
				System.out.println(i);
				System.out.println(k);
			}
		}
	}
}
