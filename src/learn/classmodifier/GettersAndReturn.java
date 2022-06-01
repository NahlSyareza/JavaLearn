package learn.classmodifier;

// Return is basically simplfying stuff down

class ExternalClass {

	String name;
	int value;

	void speak() {

		System.out.println("My name is " + name);

	}

	int retirement(int age) {

		int retirement = 65 - age;

		return retirement;
	}

	String ofNames(String name1, String name2) {

		String listName = name1 + " and " + name2;

		return listName;
	}

	int exampleValue() {
		int value;

		value = this.value + 10;

		return value;
	}

}

public class GettersAndReturn {

	public static void main(String[] args) {

		ExternalClass classOne = new ExternalClass();

		classOne.value = 20;

		String customName = classOne.ofNames("Marcus Salvius Aper", "Gaius Claudius Aurelius");
		int customAge = classOne.retirement(42);
		int customValue = classOne.exampleValue();

		System.out.println(customName);
		System.out.println(customAge);
		System.out.println(customValue);

	}

}
