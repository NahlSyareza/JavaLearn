package hooke;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		for(String type : list) {
			System.out.println(type);
		}
	}
	
}
