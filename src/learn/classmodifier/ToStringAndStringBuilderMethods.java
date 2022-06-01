package learn.classmodifier;

class TestClass {
	
	StringBuilder bld = new StringBuilder();
	
	public int id;
	public String name;
	
	public TestClass(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public String toString() {
		bld.append(id).append(" ").append(name);		
		return bld.toString();
	}
	
	public void testString() {
		StringBuilder stb = new StringBuilder();
		
		stb.append(10).append(" ").append("Hello");
		
		System.out.println(stb.toString());
		
	}
	
}

public class ToStringAndStringBuilderMethods {

	public static void main(String[] args) { 
		
		TestClass testClass1 = new TestClass(10, "Augusta");
		
		testClass1.testString();
		
		System.out.println(testClass1);
		
	}
	
}
