package ir.drdibi.ui.profile;

import android.content.Context;

import androidx.databinding.BaseObservable;


import java.util.ArrayList;
import java.util.List;

import Model.Province;

import Repository.ProvinceRepository;

public class ProfileViewModel extends BaseObservable {


    Context context;


    List<Province> ostanlist;

    public List<String> ostanha = new ArrayList<>();


    public ProfileViewModel(Context context) {
        this.context = context;

        ProvinceRepository repository = new ProvinceRepository();

        if (repository.provinceBox.isEmpty() && repository.cityBox.isEmpty()) {
            repository.setupProvince(context);
        }

        ostanlist = repository.provinceBox.getAll();


        for (int i = 0; i < ostanlist.size(); i++) {

            ostanha.add(ostanlist.get(i).getName());
        }


    }


}
