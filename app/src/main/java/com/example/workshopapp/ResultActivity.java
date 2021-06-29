package com.example.workshopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView message;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        message=findViewById(R.id.userName);
        Bundle bundle=getIntent().getExtras();
        message.setText((String)bundle.get("message"));

    }
}