package com.example.login_image_toggle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n, p;
    RadioGroup r;
    CheckBox c;
    Button b;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n = (EditText) findViewById(R.id.n);
        p = (EditText) findViewById(R.id.p);
        r = (RadioGroup) findViewById(R.id.r);
        c = (CheckBox) findViewById(R.id.c);
        b = (Button) findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n.getText().toString().isEmpty() || p.getText().toString().isEmpty() || !c.isChecked()){
                    Toast.makeText(MainActivity.this, "fill all fields", Toast.LENGTH_SHORT).show();



                int rid = r.getCheckedRadioButtonId();
                if(rid<1){
                    Toast.makeText(MainActivity.this,"fill gender",Toast.LENGTH_SHORT ).show();
                }}
                else {
                    if ((n.getText().toString().equals("nisha")) && (p.getText().toString().equals("123456789"))) {
                        Intent in = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(in);
                    }
                }
            }
        });
    }
}