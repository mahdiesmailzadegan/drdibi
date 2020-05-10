package Repository;

import java.util.ArrayList;

import Model.Category;

public class CategoryRepo {

    private static CategoryRepo instance;
    private ArrayList<Category> dataSet = new ArrayList<>();

    public static CategoryRepo getInstance() {
        if (instance == null) {
            instance = new CategoryRepo();
        }
        return instance;
    }
}
