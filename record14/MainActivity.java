package com.example.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Spinner spinnerCourse;
TextView txtResult;
String[] course={
        "Select Course",
        "BCA",
        "MCA",
        "B.Tech",
        "M.Tech",
        "MBA",
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        spinnerCourse=findViewById(R.id.spinner);
        txtResult=findViewById(R.id.textView2);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,course);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerCourse.setAdapter(adapter);
        spinnerCourse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedCourse=course[position];
                txtResult.setText("Selected Course: " + selectedCourse);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
txtResult.setText("No course selected");
            }
        });

    }
}
