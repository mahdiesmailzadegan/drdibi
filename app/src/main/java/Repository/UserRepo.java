package Repository;

import androidx.lifecycle.MutableLiveData;

import Model.User;
import io.objectbox.Box;
import io.objectbox.BoxStore;

public class UserRepo {
    private static UserRepo instance;
    private BoxStore boxStore;
    private User dataSet = new User();

    public static UserRepo getInstance() {
        if (instance == null) {
            instance = new UserRepo();
        }
        return instance;
    }

    public MutableLiveData<User> getUser() {
        setUser();
        MutableLiveData<User> data = new MutableLiveData<>();
        data.setValue(dataSet);
        return data;
    }

    private void setUser() {

        Box<User> userBox = boxStore.boxFor(User.class);

    }


}
