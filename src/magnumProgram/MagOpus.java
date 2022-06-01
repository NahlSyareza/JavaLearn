package magnumProgram;

class Extender {
	
	int start = 0;
	
	public void dataGetter(int select, int number) {
		switch(select) {
		case 1 : 
			start = 10 + number;
			
			System.out.println(start);
			
			break;
		case 2 :
			start = number;
			
			System.out.println(start);
			
			break;
		case 3 : 
			System.out.println("Error");
			
			break;
		}
		
	}
	
	
}

public class MagOpus {

	public static void main(String[] args) {
		
		Extender ext = new Extender();
		
		ext.dataGetter(1, 3);
		
	}

}
