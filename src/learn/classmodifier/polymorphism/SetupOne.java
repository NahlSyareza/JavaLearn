package learn.classmodifier.polymorphism;

public class SetupOne {
	
	protected String name;
	protected int age;
	
	public SetupOne(String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println(name + age);
	}
	
	public void initialize() {
		System.out.println("Initializing Setup One");
	}

	public void register() {
		System.out.println(" ");
	}
	
}
