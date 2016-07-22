/**
 * Created by Rachael Johnson on 7/21/2016.
 * Copyright (c) 2016 Rachael Johnson
 * This code is available under the "MIT License".
 * Please see the file LICENSE in this distribution for license terms.
 */
package com.arenjae.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.arenjae.tictactoe.gameplay.TicTacToe;
import com.arenjae.tictactoe.gameplay.TicTacToeAIEasy;
import com.arenjae.tictactoe.gameplay.TicTacToeAIHard;
import com.arenjae.tictactoe.gameplay.TicTacToeAINormal;

import org.w3c.dom.Text;

public class GameScreen extends AppCompatActivity {

    protected Button btnTL, btnTM, btnTR;
    protected Button btnML, btnMM, btnMR;
    protected Button btnBL, btnBM, btnBR;
    protected TicTacToe game;
    protected TextView lblStatus;

    public int aiOption = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        Bundle bundle=getIntent().getExtras();
        aiOption=bundle.getInt("option");


        btnTL = (Button)findViewById(R.id.btnTL);
        btnTM = (Button)findViewById(R.id.btnTM);
        btnTR = (Button)findViewById(R.id.btnTR);
        btnML = (Button)findViewById(R.id.btnML);
        btnMM = (Button)findViewById(R.id.btnMM);
        btnMR = (Button)findViewById(R.id.btnMR);
        btnBL = (Button)findViewById(R.id.btnBL);
        btnBM = (Button)findViewById(R.id.btnBM);
        btnBR = (Button)findViewById(R.id.btnBR);

        if (aiOption==0){
            game = new TicTacToe();
        }else if(aiOption==1){
            game = new TicTacToeAIEasy();
        }else if(aiOption==2) {
            game = new TicTacToeAINormal();
        }else{ //aiOption==3
            game = new TicTacToeAIHard();
        }

        game.setController(this);
        game.resetBoard();

        btnTL.setOnClickListener(event -> game.genericBtnClick(0, 0));

        btnTM.setOnClickListener(event -> game.genericBtnClick(1, 0));

        btnTR.setOnClickListener(event -> game.genericBtnClick(2, 0));

        btnML.setOnClickListener(event -> game.genericBtnClick(0, 1));

        btnMM.setOnClickListener(event -> game.genericBtnClick(1, 1));

        btnMR.setOnClickListener(event -> game.genericBtnClick(2, 1));

        btnBL.setOnClickListener(event -> game.genericBtnClick(0, 2));

        btnBM.setOnClickListener(event -> game.genericBtnClick(1, 2));

        btnBR.setOnClickListener(event -> game.genericBtnClick(2, 2));

    }

    public void createOverlay(String strMessage){
//
//        //Creates buttons, label, original scene, and original window for overlay
//        Button btnMainMenu = new Button("Main Menu");
//        Button btnPlayAgain= new Button("Play Again");
//        Text lblMessage = new Text(strMessage);
//        Scene origScene = btnBL.getScene();
//        Stage window = (Stage) origScene.getWindow();
//
//        //Setting up the buttons
//        btnMainMenu.setMaxWidth(200);
//        btnPlayAgain.setMaxWidth(200);
//
//        //This section for setting the display of buttons
//        VBox layout = new VBox(lblMessage, btnMainMenu, btnPlayAgain);
//        layout.setStyle("-fx-background-color: rgba(0, 0, 0, 0.3);");
//        layout.getStylesheets().add(getClass().getResource("styleScene4-overlay.css").toExternalForm());
//        layout.setMaxWidth(btnBL.getScene().getWidth());
//        layout.setMaxHeight(btnBL.getScene().getHeight());
//        layout.setSpacing(10);
//        layout.setAlignment(Pos.CENTER);
//        //End section
//
//
//        //This gets a snapshot of the game, then blurs it and sets it as the background
//        //Maybe use fade animation?
//        ImageView imageView = new ImageView(btnBL.getScene().snapshot(null));
//        imageView.setEffect(new GaussianBlur(5));
//
//        //This combines the blurred background with the buttons
//        StackPane background = new StackPane(imageView,layout);
//
//        //Creates a new scene for the overlay
//        Scene scene4Overlay = new Scene(background);
//
//        //Displays overlay to user (replaces game board scene)
//        window.setScene(scene4Overlay);
//
//
//        //User chooses play again, game board resets and scene is switched
//        //to game board
//        btnPlayAgain.setOnAction(event -> {
//            game.resetBoard();
//            window.setScene(origScene);
//        });
//
//
//        //User chooses Main Menu, scene for main menu is created and then switched too.
//        btnMainMenu.setOnAction(event -> {
//            try {
//                FXMLLoader loader = new FXMLLoader(getClass().getResource("scene1.fxml"));
//                Scene scene1 = new Scene((Parent) loader.load());
//                scene1.getStylesheets().add(getClass().getResource("styleScene1.css").toExternalForm());
//                window.setScene(scene1);
//            } catch (Exception ignored){}
//        });
    }

    public void resetButtons() {

        String blank = "";
        //lblStatus.setText(blank);
        btnTL.setText(blank);
        btnTM.setText(blank);
        btnTR.setText(blank);
        btnML.setText(blank);
        btnMM.setText(blank);
        btnMR.setText(blank);
        btnBL.setText(blank);
        btnBM.setText(blank);
        btnBR.setText(blank);
    }

    public void setBtnText(int i, int j,String text){
        if (i == 0 && j==0) btnTL.setText(text);
        else if (i == 1 && j==0) btnTM.setText(text);
        else if (i == 2 && j==0) btnTR.setText(text);
        else if (i == 0 && j==1) btnML.setText(text);
        else if (i == 1 && j==1) btnMM.setText(text);
        else if (i == 2 && j==1) btnMR.setText(text);
        else if (i == 0 && j==2) btnBL.setText(text);
        else if (i == 1 && j==2) btnBM.setText(text);
        else if (i == 2 && j==2) btnBR.setText(text);
    }

    public void setLblText(String text) {//lblStatus.setText(text);}
    }

    public void setAiOption(int x){aiOption=x;}

    public int getAiOption(){return aiOption;}

}
