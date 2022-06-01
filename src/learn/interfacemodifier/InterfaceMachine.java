package learn.interfacemodifier;

public class InterfaceMachine implements InterfaceParent{
	
	public String type;
	public int id;
	
	public void registry(String type, int id) {
		System.out.println("Hello, I am type " + type);
		System.out.println("My ID is " + id);
	}

	@Override
	public void showInfo() {
		System.out.println(type);
	}

}
