package com.example.secondclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        Log.d("msg", "On Create");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("msg", "On Restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("msg", "On Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("msg", "On Resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("msg", "On Destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("msg", "On Stop");
    }
}
