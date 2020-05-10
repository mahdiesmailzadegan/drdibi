package Repository;

import java.util.ArrayList;

import Model.Province;

public class ProvinceRepo {

    private static ProvinceRepo instance;
    private ArrayList<Province> dataSet = new ArrayList<>();

    public static ProvinceRepo getInstance() {
        if (instance == null) {
            instance = new ProvinceRepo();
        }
        return instance;
    }

}
