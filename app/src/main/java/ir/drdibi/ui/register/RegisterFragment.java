package ir.drdibi.ui.register;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import Model.User;
import controller.ObjectBox;
import io.objectbox.Box;
import ir.drdibi.R;

public class RegisterFragment extends Fragment {
    private Box<User> userBox;


    private RegisterViewModel registerVM;

    public static RegisterFragment newInstance() {
        return new RegisterFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.register_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        userBox = ObjectBox.get().boxFor(User.class);
        registerVM = ViewModelProviders.of(this).get(RegisterViewModel.class);
        // TODO: Use the ViewModel


    }

}
