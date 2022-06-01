package learn.function;

// \n is a symbol for a new paragraph

// %(number)d is used for forward spacing

// %(.number)f is used to print decimal numbers as much as the "number"

public class StringBuilderAndFormat {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder();

		sb1.append("This is just a ").append("test");

		System.out.println(sb1.toString());

		StringBuilder sb2 = new StringBuilder();

		sb2.append("This is just another ").append("\ntest");

		System.out.println(sb2.toString());

		// Formatting String
		
		// %d 
		
		System.out.printf("%3d Hello", 5);

		for (int i = 0; i <= 15; i++) {
			System.out.printf("%3d number\n", i);
		}

		// Formatting value
		
		// %f for the decimal values

		System.out.printf("Rounding up numbers, %.3f\n", Math.E);

		for (double j = 4.5677D; j < 200.0D; j = (j + Math.PI) + Math.E) {
			System.out.printf("Current number : %.2f \n", j);
		}

	}

}
