package com.example.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button start_button, about_button;
    EditText editName;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start_button = (Button)findViewById(R.id.start_button);
        about_button = (Button)findViewById(R.id.about_button);
        editName = (EditText)findViewById(R.id.enter_your_name);

        //to start quiz
        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = editName.getText().toString();
                Intent question1 = new Intent(getApplicationContext(), Question1Activity.class);
                question1.putExtra("name",name);
                Toast.makeText(MainActivity.this, "Your quiz has started!", Toast.LENGTH_SHORT).show();
                startActivity(question1);
            }
        });

        //to change page into about page
        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(getApplicationContext(), AboutPageActivity.class);
                startActivity(about);
            }
        });

    }
}11