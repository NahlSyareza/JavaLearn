package learn.interfacemodifier;

public class InterfaceMain{
	
	public static void main(String[] args) {
		
		InterfaceMachine inMach = new InterfaceMachine();
		inMach.type = "Type IV";
		inMach.showInfo();
		
		InterfaceHuman inHuman = new InterfaceHuman("Marcus");
		inHuman.showInfo();
		
		InterfaceParent inParent = inHuman;
		inParent.showInfo();
		
	}


}
