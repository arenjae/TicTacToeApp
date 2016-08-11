/*
 *  Created by Rachael Johnson on 7/21/2016.
 *  Copyright (c) 2016 Rachael Johnson
 *  This code is available under the "MIT License".
 *  Please see the file LICENSE in this distribution for license terms.
 *
 */

package com.arenjae.tictactoe.gameplay;

public class TicTacToeAIImpossible extends TicTacToeAI {

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

        int score;
        int x, y;

    }


    private int minimax(int tempScore, int x, int y){
        int level=0;
        //we have reached the leaves of the tree
        if (level==0 || someoneWon())
            return 1;
        return 0;
    }

    //calculate if someone won or not
    private boolean someoneWon(){
        return false;
    }
}
