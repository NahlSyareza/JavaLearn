package notes;

class Machine {
	
	private String name;
	private int age;
	
	public Machine() {
		
	}
	
	public Machine(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
}

public class MoreReturn {
	
	public static void main(String[] args) {
		
		Machine mach1 = new Machine("Aediles", 10);
		
		System.out.println(mach1.getName());
		System.out.println(mach1.getAge());
		
	}

}
