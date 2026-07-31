package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button b1, b2 , b3 , b4;
EditText t1 , t2;
TextView reslt , txtv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.editTextText3);
        t2 = findViewById(R.id.editTextText4);
        b1 = findViewById(R.id.button6);
        b2 = findViewById(R.id.button);
        b3 = findViewById(R.id.button10);
        b4 = findViewById(R.id.button11);
        reslt=findViewById(R.id.textView2);
        txtv2=findViewById(R.id.textView);

b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Double num1=Double.parseDouble(t1.getText().toString());
        Double num2 =Double.parseDouble(t2.getText().toString());
        Double cal=num1 + num2;
        reslt.setText("add ="+cal);
    }
});

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1=Double.parseDouble(t1.getText().toString());
                Double num2 =Double.parseDouble(t2.getText().toString());
                Double cal=num1 - num2;
                reslt.setText("sub ="+cal);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1=Double.parseDouble(t1.getText().toString());
                Double num2 =Double.parseDouble(t2.getText().toString());
                Double cal=num1 / num2;
                reslt.setText("div ="+cal);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1=Double.parseDouble(t1.getText().toString());
                Double num2 =Double.parseDouble(t2.getText().toString());
                Double cal=num1 * num2;
                reslt.setText("mult ="+cal);
            }
        });
    }
}
