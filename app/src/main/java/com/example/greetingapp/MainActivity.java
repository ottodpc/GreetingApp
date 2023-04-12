package com.example.greetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // declaring view
    TextView tv;
    Button btn;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.texView);
        btn = findViewById(R.id.btnClick);
        et = findViewById(R.id.editText1);

        // adding Functionalities
        btn.setOnClickListener(view -> {
            String name = et.getText().toString();
            // Displaying the entered name
            Toast.makeText(this, "Hello "+name, Toast.LENGTH_SHORT).show();
        });
    }
}