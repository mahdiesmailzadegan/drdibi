package ir.drdibi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    Button btnEnter;
    EditText etMobile, etAge, etHeight, etWeight;
    RadioGroup rgSex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


    }

    private void findViews() {
        btnEnter = findViewById(R.id.btnEnter);
        etAge = findViewById(R.id.etAge);
        etHeight = findViewById(R.id.etHeight);
        etMobile = findViewById(R.id.etMobile);
        etWeight = findViewById(R.id.etWeight);
        rgSex = findViewById(R.id.rgSex);
    }
}