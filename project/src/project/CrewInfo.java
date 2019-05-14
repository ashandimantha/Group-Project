/**
 * The CrewInfo Class is used to store information regarding 
 * CrewMembers, ship name/health, total money and food/medical items obtained.
 */


package project;
import java.util.ArrayList;

public class CrewInfo {
	private String ShipName = "Untitled";
	private int ShipHealth = 1000;
	private int Money = 0;
	
	ArrayList<CrewMember> CrewList = new ArrayList<CrewMember>();
	ArrayList<MedicalItem> MedicalList = new ArrayList<MedicalItem>();
	ArrayList<FoodItem> FoodList = new ArrayList<FoodItem>();
	
	public void addMember(Type type, String name) {
		CrewMember crewMember = new CrewMember();
		crewMember.setName(name);
		crewMember.setType(type);
		CrewList.add(crewMember);
	}
	
	public void addMedicalItem(Medicine medicine) {
		MedicalItem medicalItem = new MedicalItem(medicine);
		MedicalList.add(medicalItem);
	}
	
	public void addFoodItem(Food food) {
		FoodItem foodItem = new FoodItem(food);
		FoodList.add(foodItem);
	}
	
	public String shipStatus() {
		return "Name: " + ShipName + "\nHealth" + ShipHealth;
	}
	
	public ArrayList<CrewMember> getCrewList() {
		return CrewList;
	}
	
	public ArrayList<MedicalItem> getMedicalItemList() {
		return MedicalList;
	}

	public ArrayList<FoodItem> getFoodItemList() {
		return FoodList;
	}
	
	public int getMoney() {
		return Money;
	}
	
	public void setShipName(String newName) {
		ShipName = newName;
	}
	
	
	public static void main(String[] args) {
		CrewInfo crewInfo = new CrewInfo();
		crewInfo.addMember(Type.TYPE1, "Bob");
		crewInfo.addMember(Type.TYPE2, "Jeff");
		crewInfo.addMember(Type.TYPE3, "Brad");
		crewInfo.addMember(Type.TYPE4, "Ryan");
		crewInfo.addFoodItem(Food.FOOD1);
		crewInfo.addFoodItem(Food.FOOD2);
		crewInfo.addFoodItem(Food.FOOD3);

		
		for (CrewMember i : crewInfo.getCrewList()) {
			System.out.println(i);
		}
		for (FoodItem i : crewInfo.getFoodItemList()) {
			System.out.println(i);
		}

	}
	

}
