/** 
 * Just test code for now
 */

package project;

public class GameEnvironment {	
	public double NumberOfDays;
		
	public void setCrewInfo() {
		CrewInfo crewInfo = new CrewInfo();
		
	}
	
	public void setNumberOfDays(double newNumber) {
		NumberOfDays = newNumber;
	}
	
	public double getNumberOfPieces() {
		return Math.floor(NumberOfDays*0.66);
	}
	
	
	
	public static void main(String[] args) {
		GameEnvironment gameEnvironment = new GameEnvironment();
		gameEnvironment.setNumberOfDays(4);

		System.out.println(gameEnvironment.getNumberOfPieces());
		
		}
		

	

}
