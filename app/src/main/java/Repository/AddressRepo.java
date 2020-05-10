package Repository;

import java.util.ArrayList;

import Model.Address;

public class AddressRepo {

    private static AddressRepo instance;
    private ArrayList<Address> dataSet = new ArrayList<>();

    public static AddressRepo getInstance() {
        if (instance == null) {
            instance = new AddressRepo();
        }
        return instance;
    }
}
