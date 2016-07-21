package com.arenjae.tictactoe.gameplay;

/*
 * This class will conduct the AI (basic)
 * It will push buttons like an actual person.
 * There are subclasses for each level of AI (easy, normal, hard)
 * Created by earthshine0 on 7/21/2016.
 */
public class TicTacToeAI extends TicTacToe{

    protected int moveX, moveY;
    protected int [][] testBoard=new int[3][3];
    protected boolean aiTurn = false;

    public TicTacToeAI() {

    }

    public int genericBtnClick(int i, int j){
        if (board[i][j]!= 0) return 0;

        if (player==1) {
            setBoard(i,j);
            controller.setBtnText(i,j,p1);
        }else{ //(player==2)
            setBoard(i,j);
            controller.setBtnText(i,j,p2);
        }


        checkBoard();
        switchPlayer();

        aiTurn = !aiTurn;

        if (aiTurn) createMove();

        return 1; //move was successful
    }

    protected void createMove(){
        //return TicTacToe.genericBtnClick(window.getScene().getClass(),btnTL,moveX,moveY);
        //If future move returns true, that means moveX and moveY are already configured.
        //if it returns false, then AI needs to create its own move
        if (!checkFutureMove())
            generateMove();
        genericBtnClick(moveX,moveY);
    }


    /*Method that reads the available places to move in TicTacToe
     * and moves to it
    */
    protected boolean checkFutureMove(){
        //Get a copy of the board
        //Systematically iterate through the board, putting in an move at each square
        //and then check to see if it would be a winning move. If it is, then put a place there.
        //This checks two things, if the user will win with that move, and if the AI will win with that move
        //generate a move (1-6, as long as it is not already occupied)
        //test move as player (if player will win, then move there)
        //then test move as AI (if AI will win, then move there)


        int computer = player;
        int user; //opposite of player

        if (player==1)
            user = 2;
        else
            user = 1;

        stupidArrayCopy(board,testBoard);

        //Check if the computer can win first
        for (moveX = 0; moveX<3;moveX++){
            for(moveY = 0; moveY<3;moveY++){
                if (testBoard[moveX][moveY]==0){
                    testBoard[moveX][moveY]=computer;
                    if (checkBoardDirections(testBoard))
                        return true;
                }
                stupidArrayCopy(board,testBoard);

            }
        }


        for (moveX = 0; moveX<3;moveX++){
            for(moveY = 0; moveY<3;moveY++){
                if (testBoard[moveX][moveY]==0) {
                    testBoard[moveX][moveY] = user;
                    if (checkBoardDirections(testBoard))
                        return true;
                }
                stupidArrayCopy(board,testBoard);
            }
        }


        return false;
    }


    protected void generateMove(){

    }

    protected void stupidArrayCopy(int [][] arraySrc,int [][] arrayDest){
        int x;
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                x=arraySrc[i][j];
                arrayDest[i][j]=x;
            }
        }
    }


}