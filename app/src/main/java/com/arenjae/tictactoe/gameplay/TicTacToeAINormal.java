package com.arenjae.tictactoe.gameplay;
import java.util.Random;

/**
 * Created by earthshine0 on 7/21/2016.
 */


public class TicTacToeAINormal extends TicTacToeAI{

    public TicTacToeAINormal() {
    }


    protected void generateMove(){

        Random rngX = new Random();
        Random rngY = new Random();

        do{
            moveX = rngX.nextInt(3);
            moveY = rngY.nextInt(3);
        }while((board[moveX][moveY]!=0));

    }

}