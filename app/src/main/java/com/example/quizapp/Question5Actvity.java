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

public class Question5Actvity extends AppCompatActivity {

    Button quitButton, submit;
    TextView acknowledgement;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        submit = (Button)findViewById(R.id.next_button);
        quitButton = (Button)findViewById(R.id.quit_button);
        acknowledgement = (TextView) findViewById(R.id.acknowledge_text);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {                           //understand this
            acknowledgement.append(toUpperCase(name));
        }
        else {
            acknowledgement.append(name);
        }

        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Question5Actvity.this, "You Have Quit! :(", Toast.LENGTH_SHORT).show();
                Intent main_screen = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(main_screen);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent final_score_card = new Intent(getApplicationContext(), FinalScoreActivity.class);
                startActivity(final_score_card);
            }
        });
    }
};