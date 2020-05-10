package Repository;

import java.util.ArrayList;

import Model.Action;

public class ActionRepo {

    private static ActionRepo instance;
    private ArrayList<Action> dataSet;

    public static ActionRepo getInstance() {
        if (instance == null) {
            instance = new ActionRepo();
        }
        return instance;
    }
}
