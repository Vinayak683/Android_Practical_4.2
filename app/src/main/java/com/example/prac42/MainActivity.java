package com.example.prac42;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.text1);
        t2=findViewById(R.id.text2);

        t1.setText("Student Name : Vinayak");
        t2.setText("Marks : 85%");

    }
}