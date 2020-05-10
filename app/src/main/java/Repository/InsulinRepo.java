package Repository;

import java.util.ArrayList;

import Model.Insulin;

public class InsulinRepo {
    private static InsulinRepo instance;
    private ArrayList<Insulin> dataSet = new ArrayList<>();

    public static InsulinRepo getInstance() {
        if (instance == null) {
            instance = new InsulinRepo();
        }
        return instance;
    }
}
