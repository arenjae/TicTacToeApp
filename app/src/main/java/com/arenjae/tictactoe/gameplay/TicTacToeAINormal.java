/**
 * Created by Rachael Johnson on 7/21/2016.
 * Copyright (c) 2016 Rachael Johnson
 * This code is available under the "MIT License".
 * Please see the file LICENSE in this distribution for license terms.
 */

package com.arenjae.tictactoe.gameplay;
import java.util.Random;

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