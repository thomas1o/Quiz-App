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

public class Question1Activity extends AppCompatActivity {

    Button quitButton, question_2;
    TextView acknowledgment, number;
    String name, num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        question_2 = (Button)findViewById(R.id.next_button);
        quitButton = (Button)findViewById(R.id.quit_button);
        acknowledgment = (TextView) findViewById(R.id.acknowledge_text);
        number = (TextView)findViewById(R.id.number);


        Intent question1 = getIntent();
        name = question1.getStringExtra("name");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {                           //understand this
            acknowledgment.append(toUpperCase(name));
        }
        else {
            acknowledgment.append(name);
        }

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
//                num = number.toString();
//                int n = Integer.parseInt(num);
                Intent question1 = new Intent(getApplicationContext(), Question2Activity.class);
                question1.putExtra("name",name);
                startActivity(question1);
            }
        });


    }
};