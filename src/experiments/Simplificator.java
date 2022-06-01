package experiments;

class Origin {
	
	String line;
	String name;
	String rank;
	String legionName;
	int value;
	int age;
	
	String stateName() {
		
		String statementName = "Hello, my name is " + name;
		
		return statementName;
	}
	
	String stateRank() {
		String statementRank = "My rank is a " + rank;
		
		return statementRank;
	}
	
	String stateLegion() {
		String statementLegion = "I am in " + legionName;
		
		return statementLegion;
	}
	
}

public class Simplificator {

	public static void main(String[] args) {
		
		Origin originOne = new Origin();
		
		originOne.name = "Marcus Salvius Aper";
		originOne.rank = "Praefectus Castrorum";
		originOne.legionName = "Legio VIII Augusta";
		
		String stateNameGet = originOne.stateName();
		String stateRankGet = originOne.stateRank();
		String stateLegionGet = originOne.stateLegion();
		
		System.out.println(stateNameGet);
		System.out.println(stateRankGet);
		System.out.println(stateLegionGet);
		
		Origin originTwo = new Origin();
		
		originTwo.name = "Gaius Claudius Nero";
		originTwo.rank = "Legatus Legionis";
		originTwo.legionName = "Legio XVI Dialis";
		
		String stateNameGetAnother = originTwo.stateName();
		String stateRankGetAnother = originTwo.stateRank();
		String stateLegionGetAnother = originTwo.stateLegion();
		
		System.out.println(stateNameGetAnother);
		System.out.println(stateRankGetAnother);
		System.out.println(stateLegionGetAnother);
	}

}
