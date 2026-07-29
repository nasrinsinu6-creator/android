package com.example.registration;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView txtWelcome;
    @Override
    protected void onCreate(Bundle savedInstancesState){
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_main2);
        txtWelcome=findViewById(R.id.textView);
        String name=getIntent().getStringExtra("Username");
        txtWelcome.setText("Welcome" + name);
    }

}
