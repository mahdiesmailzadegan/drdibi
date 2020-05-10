package Repository;

import java.util.ArrayList;

import Model.SubCategory;

public class SubCategoryRepo {

    private static SubCategoryRepo instance;
    private ArrayList<SubCategory> dataSet = new ArrayList<>();

    public static SubCategoryRepo getInstance() {
        if (instance == null) {
            instance = new SubCategoryRepo();
        }
        return instance;
    }


}
