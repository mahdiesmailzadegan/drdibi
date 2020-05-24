package ir.drdibi.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

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

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>
                (getContext(),R.layout.row,viewModel.ostanha); //selected item will look like a spinner set from XML

        binding.spinnerOstan.setAdapter(spinnerArrayAdapter);


        binding.cardsabt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), binding.spinnerOstan.getSelectedItemPosition()+"", Toast.LENGTH_SHORT).show();
            }
        });

        return binding.getRoot();
    }
}
