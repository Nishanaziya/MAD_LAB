package com.example.grid_view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView g;
    int logos [] ={R.drawable.a,R.drawable.b,R.drawable.c};
    String[] names ={"nisha","vinu","anas"};
    final Context context =this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        g = (GridView) findViewById(R.id.g);
        g.setAdapter(new ImageAdapter(this));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                builder.setMessage("Name " + String.valueOf(names[i]))
                        .setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("info alert");
                alert.show();
            }
        });
    }
}