package learn.interfacemodifier;

public class InterfaceHuman implements InterfaceParent {

	public String name;
	public int age;

	public InterfaceHuman(String name) {
		super();
		this.name = name;
	}

	public void registry(String name, int age) {
		System.out.println("Hello, my name is " + name);
		System.out.println("My age is " + age);
	}

	@Override
	public void showInfo() {
		System.out.println(name);
	}
}
