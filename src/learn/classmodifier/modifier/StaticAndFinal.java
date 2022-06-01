package learn.classmodifier.modifier;

// Statics affiliate itself with the class eg. you can do Iron.desc

// Finals cannot be initialized into anything eg. you can change getNumber's number, it will always be 7

// Voids and int/String are used to make a method

class Iron {

	public static final int getNumber = 7;
	public String name;
	public static String desc;
	public static int count;

	public Iron() {
		count++;
	}

	public static void getInfo() {
		System.out.println("Hello");
	}

	public static String getDesc() {

		return desc;
	}

}

public class StaticAndFinal {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Iron.desc = "Legio XVI Augusta";

		System.out.println(Iron.desc);

		Iron.desc = "Legio II Italica";

		System.out.println(Iron.desc);

		Iron.getInfo();

		Iron.getDesc();

		System.out.println("Before " + Iron.count);

		Iron iron1 = new Iron();
		Iron iron2 = new Iron();
		Iron iron3 = new Iron();

		System.out.println("After " + Iron.count);

		iron1.name = "Marcus Claudius";

		iron2.name = "Lucius Scipio";

		System.out.println(Iron.getNumber);
		System.out.println(iron1.name);
		System.out.println(iron2.name);

	}

}
