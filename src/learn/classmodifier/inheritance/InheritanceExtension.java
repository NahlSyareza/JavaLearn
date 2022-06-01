package learn.classmodifier.inheritance;

public class InheritanceExtension extends InheritanceSetup{
	
	@Override
	public void start() {
		System.out.println("Alternate start");
	}
	
	public void progress() {
		System.out.println("Configurations are running");
	}

}
