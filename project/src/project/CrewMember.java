/**
 * note: The member type and the attributes should be changed
 */


package project;

enum Type {
	TYPE1, TYPE2, TYPE3, TYPE4, TYPE5, TYPE6
}

public class CrewMember {
	private String name = "Untitled";
	private int health = 100;
	private int hunger = 100;
	private int tiredness = 100;
	private boolean hasPlague = false;
	
	int healthDecrease;
	int hungerDecrease;
	int tirednessDecrease;
	Type type;

	
	public void setType(Type type) {
        switch (type) {
        case TYPE1:
            healthDecrease = 10;
            hungerDecrease = 10;
            tirednessDecrease = 10;
            break;
        case TYPE2:
            healthDecrease = 10;
            hungerDecrease = 10;
            tirednessDecrease = 10;
            break;
        case TYPE3:
            healthDecrease = 10;
            hungerDecrease = 10;
            tirednessDecrease = 10;
            break;
        case TYPE4:
            healthDecrease = 10;
            hungerDecrease = 10;
            tirednessDecrease = 10;
            break;
        case TYPE5:
            healthDecrease = 10;
            hungerDecrease = 10;
            tirednessDecrease = 10;
            break;
        case TYPE6:
            healthDecrease = 10;
            hungerDecrease = 10;
            tirednessDecrease = 10;
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
	
	
	public void feed(FoodItem food) {
		hunger += food.getNutrition();
	}
	
	public void consumeMedicalItem(MedicalItem item) {
		if (item.CuresPlague() && hasPlague) {
			hasPlague = false;
			health += item.getHealthIncrease();
		} else {
			health += item.getHealthIncrease();
		}
		
	}
	
	public void sleep() {
		tiredness = tiredness / 2;
	}
	
	public String getStatus() {
		return name + "\nHealth: " + health + "\nTiredness: " + tiredness
				+ "\nHunger: " + hunger;
	}


}

