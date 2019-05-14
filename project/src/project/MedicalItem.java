/**
 * Note: medicine name and attributes should be changed
 */

package project;

enum Medicine {
	MEDICINE1, MEDICINE2, MEDICINE3
}

public class MedicalItem {
	private String name;
	private boolean CuresPlague = false;
	private int HealthIncrease = 0;
	private int price;
	
	Medicine medicine;
	
	public MedicalItem(Medicine medicine) {
        switch (medicine) {
        case MEDICINE1:
            name = "MEDICINE1";
            price = 100;
            HealthIncrease = 50;
            CuresPlague = true;
            break;
        case MEDICINE2:
            name = "MEDICINE2";
            price = 50;
            HealthIncrease = 50;
            break;
        case MEDICINE3:
            name = "MEDICINE3";
            price = 30;
            HealthIncrease = 35;
            break;
            }
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHealthIncrease() {
		return HealthIncrease;
	}
	
	public boolean CuresPlague() {
		return CuresPlague;
	}
	

	
	
}
