package learn.classmodifier;

//Method Parameters

class Speak {
	
	@SuppressWarnings("unused")
	private String sciribitis;

	public void sayLine(String line1) {

		System.out.println(line1);

		System.out.println("Your line is - " + line1);

	}

	public String saySciribitis(String sciribitis) {
		this.sciribitis = sciribitis;
		
		return sciribitis;
	}
	
	public void sayNumber(int value1) {
		System.out.println(value1);
	}

	public void sayLineNumber(String line2, int value2) {
		System.out.println("Your line is - " + line2 + ". Your number is - " + value2 + ".");
	}

}

public class ClassAndObject2 {

	public static void main(String[] args) {

		Speak speak = new Speak();
		
		speak.sayLine("String test line 2");

		speak.sayNumber(20);

		speak.sayNumber(30);
		
		System.out.println(speak.saySciribitis("Taxation"));

	}

}
