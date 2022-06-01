package notes;

//You CANNOT print void, so put the sysout inside the void method and then call it

// Play around with 'this'

class Base {
	
	String name;
	int id;
	
	public void notThis(String name, int id) {
		name = this.name + " Marcus";
		id = this.id + 10;
		
		System.out.println(name + " " +  id);
	}
	
	public String returner(String line, int value) {
		return line + value;
	}
	
}

public class Tester {
	
	public static void main(String[] args) {
		
		Base base1 = new Base();
		
		base1.name = "Hello";
		base1.id = 10;
		
		System.out.println(base1.name);
		System.out.println(base1.id);
		
		base1.notThis("Hi", 5);
		
		System.out.println(base1.returner("Hello line ", 10));
		
		
	}

}
