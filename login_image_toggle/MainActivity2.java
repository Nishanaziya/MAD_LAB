package com.example.login_image_toggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    ImageView i,im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        i = (ImageView) findViewById(R.id.i);
        im =(ImageView) findViewById(R.id.im);

        i.setOnClickListener(this::onClick);
        im.setOnClickListener(this::onClick);

    }

    private void onClick(View view) {

        if(view.getId()==R.id.im){
            im.setVisibility(view.GONE);
            i.setVisibility(view.VISIBLE);
        }

        else{
            i.setVisibility(view.GONE);
            im.setVisibility(view.VISIBLE);
        }

    }
}