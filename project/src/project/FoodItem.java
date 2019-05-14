package project;

enum Food {
	FOOD1, FOOD2, FOOD3, FOOD4, FOOD5, FOOD6
}

public class FoodItem {
	private String name;
	private int price;
	private int nutrition;
	Food food;
	
	public FoodItem(Food food) {
        switch (food) {
        case FOOD1:
            name = "FOOD1";
            price = 100;
            nutrition = 10;
            break;
        case FOOD2:
            name = "FOOD2";
            price = 100;
            nutrition = 10;
            break;
        case FOOD3:
            name = "FOOD3";
            price = 100;
            nutrition = 10;
            break;
        case FOOD4:
            name = "FOOD4";
            price = 100;
            nutrition = 10;
            break;
        case FOOD5:
            name = "FOOD5";
            price = 100;
            nutrition = 10;
            break;
        case FOOD6:
            name = "FOOD6";
            price = 100;
            nutrition = 10;
            break;
        }	
	}
	
	public String toString() {
		return name + "\nNutrition: " + nutrition + "\nPrice: " + price;
	}
	
	public int getNutrition() {
		return nutrition;
	}

}
