package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2;
    Button a,s,m,d;
    TextView r;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 =(EditText) findViewById(R.id.n1);
        n2 =(EditText) findViewById(R.id.n2);
        a=(Button) findViewById(R.id.a);
        s=(Button) findViewById(R.id.s);
        m=(Button) findViewById(R.id.m);
        d=(Button) findViewById(R.id.d);
        r= (TextView) findViewById(R.id.r);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = Integer.parseInt(n1.getText().toString())+Integer.parseInt(n2.getText().toString());
                r.setText(String.valueOf(res));
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res =Integer.parseInt(n1.getText().toString())-Integer.parseInt(n2.getText().toString());
                r.setText(String.valueOf(res));
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res =Integer.parseInt(n1.getText().toString())*Integer.parseInt(n2.getText().toString());
                r.setText(String.valueOf(res));
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res =Integer.parseInt(n1.getText().toString())/Integer.parseInt(n2.getText().toString());
                r.setText(String.valueOf(res));
            }
        });
    }
}