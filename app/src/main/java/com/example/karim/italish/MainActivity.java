package com.example.karim.italish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Numbers , Family , Colors , Phrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Numbers = findViewById(R.id.numbersActivity);
        Family = findViewById(R.id.familyActivity);
        Phrases = findViewById(R.id.phrasesActivity);
        Colors = findViewById(R.id.colorsActivity);

        Numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(MainActivity.this , NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        Family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(MainActivity.this , FamilyActivity.class);
                startActivity(numbersIntent);
            }
        });

        Phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(MainActivity.this , PhrasesActivity.class);
                startActivity(numbersIntent);
            }
        });

        Colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(MainActivity.this , ColorsActivity.class);
                startActivity(numbersIntent);
            }
        });
    }
}
