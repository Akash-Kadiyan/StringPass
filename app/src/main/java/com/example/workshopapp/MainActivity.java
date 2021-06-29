package com.example.workshopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mytextView;
    Button nextbutton;
    EditText messageField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mytextView=findViewById(R.id.hellotext);
        nextbutton=findViewById(R.id.nextbtn);
        messageField=findViewById(R.id.messageText);

        nextbutton.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v) {
                String messageStr= messageField.getText().toString().trim();
                Intent intent=new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("message",messageStr);
                startActivity(intent);
            }
        });
    }
}