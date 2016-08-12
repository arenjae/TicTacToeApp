/*
 *  Created by Rachael Johnson on 7/21/2016.
 *  Copyright (c) 2016 Rachael Johnson
 *  This code is available under the "MIT License".
 *  Please see the file LICENSE in this distribution for license terms.
 *
 */

package com.arenjae.tictactoe.gameplay;

public class TicTacToeAIImpossible extends TicTacToeAI {
    protected int testBoardAI[][] = new int[3][3];

    public TicTacToeAIImpossible() {
    }

    @Override
    protected void generateMove() {
        /* This uses the minimax algorithm to generate a move
        *     0 | 1 | 2 |
        *  0|___|___|___|
        *  1|___|___|___|
        *  2|___|___|___|
        *
        */

        int score=-2;

        //now we have a copy of the gameboard
        stupidArrayCopy(board,testBoardAI);
        int testPlayer;
        if (player == 2) testPlayer=1;
        else testPlayer=-1;

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (testBoardAI[i][j]!=0) break; //space is already occupied
                testBoardAI[i][j]=testPlayer;
                int tempScore = -minimax(testBoardAI,testPlayer);
                testBoardAI[i][j]=0;
                if (tempScore>score){
                    moveX=i;
                    moveY=j;
                }
            }
        }
    }
    private int minimax(int [][] testBoardAI, int player){
        boolean winner=checkBoardDirections(testBoardAI);
        if (winner) return 10*(player);

        int x=-1, y=-1;
        int score=-2;

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (testBoardAI[i][j]!=0) break; //space is already occupied
                testBoardAI[i][j]=player;
                int thisScore = -minimax(testBoardAI,player*(-1));
                if (thisScore>score){
                    score=thisScore;
                    x=i;
                    y=j;
                }
                testBoardAI[i][j]=0;
            }
        }

        if(x==-1 || y==-1){
            return 0;
        }
        return score;
    }

    //calculate if someone won or not
    private boolean noMoreMoves(){
        return false;
    }
}
