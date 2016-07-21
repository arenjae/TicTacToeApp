package com.arenjae.tictactoe.gameplay;
import java.util.Random;
/**
 * Created by earthshine0 on 7/21/2016.
 * Uses random number generator to pick random places on the board.
 */
public class TicTacToeAIEasy extends TicTacToeAI{

    public TicTacToeAIEasy() {
    }


    protected void generateMove(){

        Random rngX = new Random();
        Random rngY = new Random();

        do{
            moveX = rngX.nextInt(3);
            moveY = rngY.nextInt(3);
        }while((board[moveX][moveY]!=0));

    }

    protected void createMove(){
        //If future move returns true, that means moveX and moveY are already configured.
        //if it returns false, then AI needs to create its own move
        generateMove();
        genericBtnClick(moveX,moveY);
    }

}