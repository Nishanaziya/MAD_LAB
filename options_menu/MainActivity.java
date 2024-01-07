package com.example.options_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.new_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id==R.id.contact){
            Toast.makeText(this,"contact",Toast.LENGTH_SHORT).show();
        }

        if(id==R.id.msg){
            Toast.makeText(this,"msg", Toast.LENGTH_SHORT).show();
        }

        if(id==R.id.people){
            Toast.makeText(this,"people",Toast.LENGTH_SHORT).show();
        }

        if(id==R.id.home){
            Toast.makeText(this,"home",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}