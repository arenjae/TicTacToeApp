/**
 * Created by Rachael Johnson on 7/21/2016.
 * Copyright (c) 2016 Rachael Johnson
 * This code is available under the "MIT License".
 * Please see the file LICENSE in this distribution for license terms.
 */

package com.arenjae.tictactoe.gameplay;
import java.util.Random;
/**
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