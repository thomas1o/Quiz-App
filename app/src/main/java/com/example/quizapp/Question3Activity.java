package com.example.quizapp;

import static android.icu.lang.UCharacter.toUpperCase;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Question3Activity extends AppCompatActivity {

    Button quitButton, question_4;
    TextView acknowledgment;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        question_4 = (Button)findViewById(R.id.next_button);
        quitButton = (Button)findViewById(R.id.quit_button);
        acknowledgment = (TextView) findViewById(R.id.acknowledge_text);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {                           //understand this
            acknowledgment.append(toUpperCase(name));
        }
        else {
            acknowledgment.append(name);
        }

        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Question3Activity.this, "You Have Quit! :(", Toast.LENGTH_SHORT).show();
                Intent main_screen = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(main_screen);
            }
        });

        question_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent question_4 = new Intent(getApplicationContext(), Question4Activity.class);
                question_4.putExtra("name",name);
                startActivity(question_4);
            }
        });
    }
};