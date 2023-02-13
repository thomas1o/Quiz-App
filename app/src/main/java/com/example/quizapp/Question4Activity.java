package com.example.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Question4Activity extends AppCompatActivity {

    Button quitButton, question_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        question_5 = (Button)findViewById(R.id.next_button);
        quitButton = (Button)findViewById(R.id.quit_button);

        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Question4Activity.this, "You Have Quit! :(", Toast.LENGTH_SHORT).show();
                Intent main_screen = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(main_screen);
            }
        });

        question_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next_question = new Intent(getApplicationContext(), Question5Actvity.class);
                startActivity(next_question);
            }
        });
    }
};
