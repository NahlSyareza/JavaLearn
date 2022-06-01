package learn.function;

class Machine {
	
	public void initialize() {
		System.out.println("Initializing machine");
	}
	
}

class Computer extends Machine{
	
	@Override
	public void initialize() {
		System.out.println("Initializing computer");
	}
	
	public void run() {
		System.out.println("Preparing to run program");
	}
	
}

public class UpcastingandDowncasting {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		Computer comp1 = new Computer();
		
		//This is your normal method calling
		mach1.initialize();
		comp1.initialize();
		comp1.run();
		
		// Will run the initialize() inside the Computer class
		Machine mach2 = comp1;
		
		mach2.initialize();
		
		
	}
	
}
