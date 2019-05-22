package spaceExplorer;

/**
 * note: The member type and the attributes should be changed
 */

enum Type {
	TYPE1, TYPE2, TYPE3, TYPE4, TYPE5, TYPE6
}

public class CrewMember {
	public String name = "Untitled";
	public int health = 100;
	public int hunger = 0;
	public int tiredness = 0;
	public int NumberOfMoves = 2;
	public boolean hasPlague = false;
	public boolean easterEgg = false;
	public String ability;
	
	int healthDecrease;
	int hungerDecrease;
	int tirednessDecrease;
	Type type;

	
	public void setType(Type type) {
        switch (type) {
        case TYPE1:
            healthDecrease = 20;
            hungerDecrease = 10;
            tirednessDecrease = 10;
            ability = "Repairs the ship faster";
            break;
        case TYPE2:
            healthDecrease = 10;
            hungerDecrease = 30;
            tirednessDecrease = 10;
            ability = "Regenerate health over time";
            break;
        case TYPE3:
            healthDecrease = 20;
            hungerDecrease = 10;
            tirednessDecrease = 15;
            ability = "Fasting";
            easterEgg = true;
            break;
        case TYPE4:
            healthDecrease = 10;
            hungerDecrease = 20;
            tirednessDecrease = 10;
            ability = "Work extra hours";
            break;
        case TYPE5:
            healthDecrease = 15;
            hungerDecrease = 10;
            tirednessDecrease = 10;
            ability = "Increased armour";
            break;
        case TYPE6:
            healthDecrease = 10;
            hungerDecrease = 10;
            tirednessDecrease = 20;
            ability = "High chance of finding loot";
            break;
        }	
	}
	
	public String toString() {
		return name + "\nHealth: " + health + "\nTiredness: " + tiredness
				+ "\nHunger: " + hunger;
	}
	
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getHunger() {
		return hunger;
	}
	
	public int getNumberOfMoves() {
		return NumberOfMoves;
	}
	
	public void feed(FoodItem food) {
		NumberOfMoves -= 1;
		hunger += food.getNutrition();
	}
	
	public void consumeMedicalItem(MedicalItem item) {
		NumberOfMoves -= 1;
		if (item.CuresPlague() && hasPlague) {
			hasPlague = false;
			health += item.getHealthIncrease();
		} else {
			health += item.getHealthIncrease();
		}
		
	}
	
	public void sleep() {
		NumberOfMoves -= 1;
		tiredness = 0;
	}
	
	public String getStatus() {
		return name + "\nHealth: " + health + "\nTiredness: " + tiredness
				+ "\nHunger: " + hunger;
	}

	public static void main(String[] args) {
//		CrewMember CrewMember = new CrewMember();
//		CrewMember.setName("Astro");
//		System.out.println(CrewMember);
	}

}

