/**
 * Created by Rachael Johnson on 7/21/2016.
 * Copyright (c) 2016 Rachael Johnson
 * This code is available under the "MIT License".
 * Please see the file LICENSE in this distribution for license terms.
 */

package com.arenjae.tictactoe.gameplay;
import java.util.Random;

public class TicTacToeAIHard extends TicTacToeAI {

    public TicTacToeAIHard() {
    }


    protected void generateMove(){

        /* Because this is the impossible/hard difficulty setting
        *  the moves will be in a particular order.
        *  Steps-
        *  1. try to get a corner
        *  2. try to get the middle
        *  3. that should be all
        *     0 | 1 | 2 |
        *  0|___|___|___|
        *  1|___|___|___|
        *  2|___|___|___|
        *
        */

        int middle = 1;
        if (playerHasACorner() && board[middle][middle]==0){
            moveX=moveY=middle;
        }else if (cornerIsAvailable()) {
            moveToACorner();
        }else if (board[middle][middle]==0){
            moveX=moveY=middle;
        }else if (sideIsAvailable()){
            moveToASide();
        }

    }

    //Returns true if user has a corner
    private boolean playerHasACorner(){
        return (board[0][0] != 0 && board[0][0] != player) || (board[0][2] != 0 && board[0][2] != player)
                || (board[2][0] != 0 && board[2][0] != player) || (board[2][2] != 0 && board[2][2] != player);
    }

    private boolean cornerIsAvailable() {
        return  (board[0][0]==0 || board[2][0]==0 || board[0][2]==0 || board[2][2]==0);
    }

    private boolean sideIsAvailable() {
        return  (board[1][0]==0 || board[0][1]==0 || board[2][1]==0 || board[1][2]==0);
    }


    private void moveToACorner(){
        int cornerX = 0;
        int cornerY = 0;
        Random rnd = new Random();
        int randomCorner;
        do {
            randomCorner = rnd.nextInt(4);
            if (randomCorner==0){
                moveX=cornerX;
                moveY=cornerY;
            }else if (randomCorner==1){
                moveX=cornerX+2;
                moveY=cornerY;
            }else if(randomCorner==2){
                moveX=cornerX+2;
                moveY=cornerY+2;
            }else {// if(randomCorner==3)
                moveX = cornerX;
                moveY = cornerY+2;
            }
        }while(board[moveX][moveY]!=0);
    }


    private void moveToASide() {
        int cornerX = 0;
        int cornerY = 0;
        Random rnd = new Random();
        int randomSide;
        do {
            randomSide = rnd.nextInt(4);
            if (randomSide==0){
                moveX=cornerX+1;
                moveY=cornerY;
            }else if (randomSide==1){
                moveX=cornerX;
                moveY=cornerY+1;
            }else if(randomSide==2){
                moveX=cornerX+2;
                moveY=cornerY+1;
            }else {// if(randomSide==3)
                moveX = cornerX+1;
                moveY = cornerY+2;
            }
        }while(board[moveX][moveY]!=0);
    }
}