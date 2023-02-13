package com.example.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Question1Activity extends AppCompatActivity {

    Button quitButton, question_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        question_2 = (Button)findViewById(R.id.next_button);
        quitButton = (Button)findViewById(R.id.quit_button);

        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Question1Activity.this, "You Have Quit! :(", Toast.LENGTH_SHORT).show();
                Intent main_screen = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(main_screen);
            }
        });

        question_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next_question = new Intent(getApplicationContext(), Question2Activity.class);
                startActivity(next_question);
            }
        });


    }
};