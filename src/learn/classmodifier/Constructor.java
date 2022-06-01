package learn.classmodifier;

//Learning about constructors

@SuppressWarnings("unused")
class Machine {
	
	private String name;
	private int value;
	
	public Machine() {
		System.out.println("First Construct");
	}
	
	public Machine(String name) {
		this(name, 0);
		
		System.out.println(name);
		this.name = name;
	}
	
	public Machine(String name, int value) {
		
		this.name = name;
		this.value = value;
		
		System.out.println(name);
		System.out.println(value);
	}
}

public class Constructor {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Second Constructor");
		Machine machine3 = new Machine("Third Constructor", 1);
		
	}

}
