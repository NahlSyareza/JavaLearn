package learn.function;

public class ArrayString {

	public static void main(String[] args) {

		String[] words = new String[3];
		
		words[0] = "Salve";
		words[1] = "Mihi nomen est";
		words[2] = "Augustus";
		
		for(int i = 0 ; i<words.length ; i++) {
			
			System.out.println(words[i]);
			
		}
		
		String[] items = {"Legatus Legionis", "Magister Militum", "Praefectus Castrorum"};
		
		for(String item : items) {
			
			System.out.println(item);
		
		}
		
		String[] valii = new String[2];
		
		System.out.println(valii[0]);
		
		valii[0] = "Classis";
		
	}

}
