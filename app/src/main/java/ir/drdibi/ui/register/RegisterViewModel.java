package ir.drdibi.ui.register;

import androidx.lifecycle.ViewModel;

import Model.User;
import Repository.UserRepo;
import io.objectbox.android.ObjectBoxLiveData;

public class RegisterViewModel extends ViewModel {
    private ObjectBoxLiveData<User> user;

    private UserRepo userRepo;

    // TODO: Implement the ViewModel
}

