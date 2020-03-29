package ir.drdibi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import Controller.ObjectBox;
import Model.MyObjectBox;
import Model.Province;
import Model.User;
import io.objectbox.Box;
import io.objectbox.BoxStore;
import io.objectbox.android.AndroidObjectBrowser;

public class RegisterActivity extends AppCompatActivity {
    Button btnRegister;
    EditText userName, userFName, userWeight, userAge;
    BoxStore boxStore;
    Box<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnRegister = findViewById(R.id.btnRegister);
        userName = findViewById(R.id.userName);
        userFName = findViewById(R.id.userFName);
        userWeight = findViewById(R.id.userWeight);
        userAge = findViewById(R.id.userAge);
        boxStore = ObjectBox.get();
        users = ObjectBox.get().boxFor(User.class);
        List<User> usersList = users.getAll();

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User();
                user.setName(userName.getText().toString());
                user.setfName(userFName.getText().toString());
                Province province= new Province();

                Toast.makeText(RegisterActivity.this, usersList.toString(), Toast.LENGTH_LONG).show();

            }
        });


    }
}
