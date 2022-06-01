package learn.classmodifier.inheritance;

public class InheritanceMain {
		
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		InheritanceSetup inS = new InheritanceSetup();
		
		//inS.start();
		//inS.end();
		
		InheritanceExtension inX = new InheritanceExtension();
		
		inX.start();
		inX.progress();
		inX.end();
		
	}
	
	
}
