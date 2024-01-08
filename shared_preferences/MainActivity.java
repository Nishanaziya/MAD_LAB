package com.example.shared_preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username =(EditText) findViewById(R.id.u);
        password =(EditText) findViewById(R.id.p);
    }

    public void save(View view){

        SharedPreferences sh = getSharedPreferences("MyData", MODE_PRIVATE);
        SharedPreferences.Editor ed = sh.edit();
        ed.putString("name",username.getText().toString());
        ed.putString("password",password.getText().toString());
        ed.commit();
        Toast.makeText(this,"Data saved",Toast.LENGTH_SHORT).show();

    }

    public void next(View view){
        Toast.makeText(this, "Next page", Toast.LENGTH_SHORT).show();
        Intent in = new Intent(this, MainActivity2.class);
        startActivity(in);
    }


}