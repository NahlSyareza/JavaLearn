package learn.classmodifier.modifier;

// Public can be accessed anywhere

// Private can only be accessed in the same class

// Protected can be accessed by it's child classes

public class GlobalModifierSetup {
	
	public String name;
	
	public static final int id = 10;
	
	protected String type;
	
	public GlobalModifierSetup(String name) {
		this.name = "Test1";
		
		this.type = "Living";
	}

}
