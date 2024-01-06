class FoodItem {
    final private int CALORIES_PER_GRAM = 9;
    private int fatGrams;
    protected int servings; 

    public FoodItem(int numFatGrams, int numServings) {
        fatGrams = numFatGrams;
        servings = numServings;
    }

    private int calories() {
        return fatGrams * CALORIES_PER_GRAM;
    }

    public int caloriesPerServing() {
        return (calories() / servings);
    }
}

class Pizza extends FoodItem {
    public Pizza(int fatGrams) {
        super(fatGrams, 8);
    }
}
public class FoodAnalyzer {
    public static void main(String[] args) {
        Pizza special = new Pizza(275);
        System.out.println("Calories per serving: "+ special.caloriesPerServing());
    }
}
