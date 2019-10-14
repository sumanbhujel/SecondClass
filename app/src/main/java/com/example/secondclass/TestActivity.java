package com.example.secondclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        radioGroup = findViewById(R.id.rgSubject);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == R.id.rbAndroid){
                    Toast.makeText(TestActivity.this, "Android", Toast.LENGTH_SHORT).show();
                }
                if(i == R.id.rbWeb){
                    Toast.makeText(TestActivity.this, "WebAPI", Toast.LENGTH_SHORT).show();
                }
                if(i == R.id.rbIot){
                    Toast.makeText(TestActivity.this, "IOT", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

// https://material-ui.com
// https://materializecss.com
// https://www.flaticon.com


//1. vxs
//2. design
//3. programming logic
//4. data persistency webapi,sqlite
//5. testing , wearable & sensors