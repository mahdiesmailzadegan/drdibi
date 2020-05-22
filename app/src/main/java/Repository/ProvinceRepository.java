package Repository;

import android.content.Context;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

import Model.Province;
import controller.ObjectBox;
import io.objectbox.Box;

public class ProvinceRepository {

    Box<Province> provinceBox = ObjectBox.get().boxFor(Province.class);


    public void setupProvince(Context context) {


        String jsonString = null;

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






                    provinceBox.put(new Province(object.getString("name")));




            }


        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }


    }


}
