package Repository;

import java.util.ArrayList;

import Model.City;

public class CityRepo {

    private static CityRepo instance;
    private ArrayList<City> dataSet = new ArrayList<City>();

    public static CityRepo getInstance() {
        if (instance == null) {
            instance = new CityRepo();
        }
        return instance;
    }
}
