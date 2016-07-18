package com.arenjae.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    Button btnNewGame;
    Button btnNewGameCPU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        btnNewGame = (Button)findViewById(R.id.btnNewGame);
        btnNewGameCPU = (Button)findViewById(R.id.btnNewGameCPU);
    }

}
