package com.example.intent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView e1, e2,e3,e4;
    Button b;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        e1 = findViewById(R.id.textView);
        e2 = findViewById(R.id.textView2);
        e3 = findViewById(R.id.textView3);
        e4 = findViewById(R.id.textView4);
        b=findViewById(R.id.button2);
        Bundle extra = getIntent().getExtras();
        String text = extra.getString("name");
        String text1 = extra.getString("age");
        String text2 = extra.getString("place");
        String text3 = extra.getString("college");


        e1.setText(text);
        e2.setText(text1);
        e3.setText(text2);
        e4.setText(text3);
    }
    public void click(View view){
        Intent i=new Intent(this, MainActivity3.class);
        startActivity(i);
    }
}
