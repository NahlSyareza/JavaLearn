package notes;

class ExtenderPrograme {
	
	public ExtenderPrograme(String tribute) {
		tribute = "Booker";
		System.out.println(tribute);
	}
	
}

@SuppressWarnings({"unused"})
public class ConstructorManipulation {

	public static void main(String[] args) {
		ExtenderPrograme extPrograme = new ExtenderPrograme("T");
	}
	
}
