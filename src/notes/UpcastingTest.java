package notes;

class Mach {
	
	private String name;
	
	public void start() {
		System.out.println("Machine is starting");
	}
	
	public String setName(String name) {
		this.name = name;
		
		return name;
	}
	
	public void getName() {
		System.out.println(name);
	}
	
}


public class UpcastingTest {
	
	public static void main(String[] args) {
		
		Mach mach1 = new Mach();
		
		mach1.setName("Machine 1");
		mach1.getName();
		
		Mach mach2 = mach1;
		
		mach2.setName("Machine 2");
		mach2.getName();
		
	}

}
