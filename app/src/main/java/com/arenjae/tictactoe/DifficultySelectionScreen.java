/**
 * Created by Rachael Johnson on 7/21/2016.
 * Copyright (c) 2016 Rachael Johnson
 * This code is available under the "MIT License".
 * Please see the file LICENSE in this distribution for license terms.
 */

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

        btnEasy.setOnClickListener(e -> activityStart(1));
        btnNormal.setOnClickListener(e -> activityStart(2));
        btnHard.setOnClickListener(e-> activityStart(3));
    }

    void activityStart(int option){
        Intent i = new Intent(getApplicationContext(),GameScreen.class);
        i.putExtra("option",option);
        startActivity(i);
    }

}
