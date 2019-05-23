package spaceExplorer;
/**
 * note: Food Item and its attributes should be renamed
 * 		to create food item FoodItem(Food.FOODNAME)
 */

enum Food {
	CHICKEN, BURGER, TOFFEE, TEA, ICECREAM, BREAD
}

public class FoodItem {
	private String name;
	private int price;
	private int nutrition;
	public String imageIcon;
	public int foodCount = 1;
	Food food;
	
	public FoodItem(Food food) {
        switch (food) {
        case CHICKEN:
            name = "Chicken";
            price = 30;
            nutrition = 25;
            imageIcon = "/spaceExplorer/Chicken.png";
            break;
        case BURGER:
            name = "Burger";
            price = 23;
            nutrition = 15;
            imageIcon = "/spaceExplorer/burger.png";
            break;
        case TOFFEE:
            name = "Toffee";
            price = 5;
            nutrition = 2;
            imageIcon = "/spaceExplorer/Toffee.png";
            break;
        case TEA:
            name = "Tea";
            price = 8;
            nutrition = 3;
            imageIcon = "/spaceExplorer/tea.png";
            break;
        case ICECREAM:
            name = "Ice Cream";
            price = 10;
            nutrition = 5;
            imageIcon = "/spaceExplorer/ice cream.png";
            break;
        case BREAD:
            name = "Bread";
            price = 18;
            nutrition = 10;
            imageIcon = "/spaceExplorer/Bread.png";
            break;
        }	
	}
	
	public String toString() {
		return name + "\nNutrition: " + nutrition + "\nPrice: " + price;
	}
	
	public int getNutrition() {
		return nutrition;
	}
	
	public int getPrice() {
		return price;
	}
	
}