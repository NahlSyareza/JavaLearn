package learn.classmodifier;

// Can be used to access 

class Data {
	
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}

public class SettersAndThis {

	public static void main(String[] args) {
		
		Data dataOne = new Data();
		
		dataOne.name = "Marcus Junius Brutus";
		dataOne.age = 35;
		
		System.out.println(dataOne.getName());
		System.out.println(dataOne.getAge());

	}

}
