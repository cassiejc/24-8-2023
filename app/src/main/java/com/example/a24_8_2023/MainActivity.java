package com.example.a24_8_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button_id);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello welcome to Android", Toast.LENGTH_LONG).show();
            }
        });

        b2 = findViewById(R.id.button);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is 1", Toast.LENGTH_LONG).show();
            }
        });

        b3 = findViewById(R.id.button2);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                textView1.setText("Hello");
                Toast.makeText(MainActivity.this, "This is 2", Toast.LENGTH_LONG).show();
            }
        });

        b4 = findViewById(R.id.button3);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is 3", Toast.LENGTH_LONG).show();
            }
        });

        b5 = findViewById(R.id.button4);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is 4", Toast.LENGTH_LONG).show();
            }
        });

        b6 = findViewById(R.id.button5);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is 5", Toast.LENGTH_LONG).show();
            }
        });

        b7 = findViewById(R.id.button6);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is 6", Toast.LENGTH_LONG).show();
            }
        });

        b8 = findViewById(R.id.button7);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is 7", Toast.LENGTH_LONG).show();
            }
        });

        b9 = findViewById(R.id.button8);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is 8", Toast.LENGTH_LONG).show();
            }
        });

        b10 = findViewById(R.id.button9);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is 9", Toast.LENGTH_LONG).show();
            }
        });
    }
}