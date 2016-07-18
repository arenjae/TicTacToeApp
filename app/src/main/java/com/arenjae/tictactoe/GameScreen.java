package com.arenjae.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameScreen extends AppCompatActivity {

    protected Button btnTL, btnTM, btnTR;
    protected Button btnML, btnMM, btnMR;
    protected Button btnBL, btnBM, btnBR;
//    protected tictactoe game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        btnTL = (Button)findViewById(R.id.btnTL);
        btnTM = (Button)findViewById(R.id.btnTM);
        btnTR = (Button)findViewById(R.id.btnTR);
        btnML = (Button)findViewById(R.id.btnML);
        btnMM = (Button)findViewById(R.id.btnMM);
        btnMR = (Button)findViewById(R.id.btnMR);
        btnBL = (Button)findViewById(R.id.btnBL);
        btnBM = (Button)findViewById(R.id.btnBM);
        btnBR = (Button)findViewById(R.id.btnBR);


//        btnTL.setOnClickListener(new View.OnClickListener(e->game.);
    }
}
