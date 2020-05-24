package Repository;

import android.content.Context;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import Model.City;
import Model.Province;
import controller.ObjectBox;
import io.objectbox.Box;

public class ProvinceRepository {

    public Box<Province> provinceBox = ObjectBox.get().boxFor(Province.class);
    public Box<City> cityBox = ObjectBox.get().boxFor(City.class);


    public void setupProvince(Context context) {


        String jsonString;

        try {
            InputStream inputStream = context.getAssets().open("iran.json");

            int size = inputStream.available();

            byte[] buffer = new byte[size];

            inputStream.read(buffer);
            inputStream.close();

            jsonString = new String(buffer, "utf-8");


            JSONObject jsonObject = new JSONObject(jsonString);

            JSONArray jsonArray = jsonObject.getJSONArray("states");

            for (int i = 0; i < jsonArray.length(); i++) {


                JSONObject object = jsonArray.getJSONObject(i);

                String ostan = object.getString("name");

                Province province = new Province();
                province.setName(ostan);
                provinceBox.put(province);


                JSONArray cityarray = object.getJSONArray("cities");


                for (int j = 0; j < cityarray.length(); j++) {
                    City city = new City();


                    JSONObject cityobject = cityarray.getJSONObject(j);

                    city.setName(cityobject.getString("name"));

                    city.province.setTarget(province);
                    cityBox.put(city);

                }





            }


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }


}
