package Repository;

import java.util.ArrayList;

import Model.Product;

public class ProductRepo {

    private static ProductRepo instance;
    private ArrayList<Product> dataSet = new ArrayList<>();

    public static ProductRepo getInstance() {
        if (instance == null) {
            instance = new ProductRepo();
        }
        return instance;
    }
}
