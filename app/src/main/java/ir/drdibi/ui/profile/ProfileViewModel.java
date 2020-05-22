package ir.drdibi.ui.profile;

import android.content.Context;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.util.ArrayList;
import java.util.List;

import Repository.ProvinceRepository;
import ir.drdibi.BR;

public class ProfileViewModel extends BaseObservable {


    List<String> listostanha = new ArrayList<>();
    Context context;


    public ProfileViewModel(Context context) {
        this.context = context;

        ProvinceRepository repository = new ProvinceRepository();
        CityRepository repositorycity=new CityRepository();
        repositorycity.setupcity(context);
        repository.setupProvince(context);

    }


    @Bindable
    public List<String> getListostanha() {
        return listostanha;
    }

    public void setListostanha(List<String> listostanha) {
        this.listostanha = listostanha;
        notifyPropertyChanged(BR.listostanha);
    }
}
