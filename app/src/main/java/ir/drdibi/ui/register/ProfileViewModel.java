package ir.drdibi.ui.register;

import androidx.lifecycle.ViewModel;

import Model.User;
import Model.User_;
import io.objectbox.Box;
import io.objectbox.android.ObjectBoxLiveData;

public class ProfileViewModel extends ViewModel {
    private Box<User> userBox;


    private ObjectBoxLiveData<User> userList;

    public ObjectBoxLiveData<User> getUserLiveData() {
        if (userList == null) {
            userList = new ObjectBoxLiveData<>(userBox.query().order(User_.__ID_PROPERTY).build());
        }
        return userList;
    }


}

