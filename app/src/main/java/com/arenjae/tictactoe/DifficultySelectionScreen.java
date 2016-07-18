package com.arenjae.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DifficultySelectionScreen extends AppCompatActivity {

    Button btnEasy;
    Button btnNormal;
    Button btnHard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty_selection_screen);

        btnEasy = (Button)findViewById(R.id.btnEasy);
        btnNormal = (Button)findViewById(R.id.btnNormal);
        btnHard = (Button)findViewById(R.id.btnHard);

        btnEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),GameScreen.class);
                startActivity(i);
            }
        });

    }



}
