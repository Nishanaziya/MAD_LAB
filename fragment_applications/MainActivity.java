package com.example.fragment_applications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sports, chats, news;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();

        sports = (Button) findViewById(R.id.b1);
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fm.beginTransaction().replace(R.id.fragmentContainerView,chats.class,null).commit();
            }
        });

        chats = (Button) findViewById(R.id.b2);
        chats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fm.beginTransaction().replace(R.id.fragmentContainerView,sports.class,null).commit();
            }
        });

        news =(Button) findViewById(R.id.b3);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fm.beginTransaction().replace(R.id.fragmentContainerView,news.class,null).commit();
            }
        });

    }
}