package learn.classmodifier.polymorphism;

public class SetupTwo extends SetupOne{

	public SetupTwo(String name, int age) {
		super(name, age);
	}
	
	public void initialize() {
		System.out.println("Initializing Setup Two");
	}
	
	public void register() {
		System.out.println("Registering Setup Two");
	}

}
