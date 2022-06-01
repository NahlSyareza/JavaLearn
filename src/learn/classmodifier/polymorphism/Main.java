package learn.classmodifier.polymorphism;

// You cannot print void methods, so include a sysout in that method

//Changing ...set12 = set2 into setF won't work because there are no mentions of SetupOne inside of SetupForeign;

//Cannot have a child class equals into it's main class

//Follow this example! Also look at the setup classes

public class Main {
	
	public static void main(String[] args) {
		SetupOne set1 = new SetupOne("a ", 0);
		
		SetupTwo set2 = new SetupTwo("b ", 1);
		
		SetupOne set12 = set2;
		
		set1.register();
		
		set12.initialize();
	
		set12.register();
		
		doInitialize(set2);
	}
	
	public static void doInitialize(SetupOne set1) {
		set1.initialize();
	}

}
