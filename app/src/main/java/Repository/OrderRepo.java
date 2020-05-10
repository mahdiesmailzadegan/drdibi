package Repository;

import java.util.ArrayList;

import Model.Order;

public class OrderRepo {

    private static OrderRepo instance;
    private ArrayList<Order> dataSet = new ArrayList<>();

    public static OrderRepo getInstance() {
        if (instance == null) {
            instance = new OrderRepo();
        }
        return instance;
    }
}
