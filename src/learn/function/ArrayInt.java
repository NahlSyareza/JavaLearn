package learn.function;

//Understand this

//Java starts with 0, not 1

public class ArrayInt {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int value = 7;
		
		int[] values;
		
		values = new int[3];
		
		values[0] = 1;
		values[1] = 10;
		values[2] = 20;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		for(int i = 0 ; i<values.length ;) {
			
			System.out.println(values[i]);
			
			i++;
			
		}
		
		int[] numbers = {1, 2, 3, 4};
		
		for(int i = 0 ; i<numbers.length ; i = i + 2) {
			
			System.out.println(numbers[i]);
			
		}
		
	}

}
