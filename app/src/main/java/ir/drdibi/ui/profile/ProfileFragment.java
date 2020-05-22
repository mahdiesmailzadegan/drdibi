package ir.drdibi.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import ir.drdibi.R;
import ir.drdibi.databinding.ProfileFragmentBinding;

public class ProfileFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        ProfileFragmentBinding binding= DataBindingUtil.inflate(inflater,R.layout.profile_fragment,container,false);

        ProfileViewModel viewModel=new ProfileViewModel(getContext());

        binding.setDataprofile(viewModel);



        return binding.getRoot();
    }
}
