/** 
 * Just test code for now
 */

package project;

public class GameEnvironment {	
	private double NumberOfDays;
	private double NumberOfPieces = Math.floor(NumberOfDays*0.75);
		
	public void setCrewInfo() {
		CrewInfo crewInfo = new CrewInfo();
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		GameEnvironment game = new GameEnvironment();
		
		CrewMember Ryan = new CrewMember();
		FoodItem food1 = new FoodItem(Food.FOOD1);
		MedicalItem Medicine1 = new MedicalItem(Medicine.MEDICINE1);
		
		Ryan.setName("test name");
		Ryan.feed(food1);
		Ryan.consumeMedicalItem(Medicine1);
		System.out.println(Ryan.getStatus());
		
	}
	

}
