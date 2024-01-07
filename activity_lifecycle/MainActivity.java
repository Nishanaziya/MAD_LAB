package com.example.activity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle","onCreate Invoked");
    }
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle","onStart Invoked");
    }
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle","onResume Invoked");
    }
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle","onPause Invoked");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle","onDestroy Invoked");
    }
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle","onStop Invoked");
    }
}