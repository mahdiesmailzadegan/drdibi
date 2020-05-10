package Repository;

import java.util.ArrayList;

import Model.Food;

public class FoodRepo {
    private static FoodRepo instance;
    private ArrayList<Food> dataSet = new ArrayList<>();

    public static FoodRepo getInstance() {
        if (instance == null) {
            instance = new FoodRepo();
        }
        return instance;
    }
}
