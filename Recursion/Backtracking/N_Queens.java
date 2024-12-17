package Backtracking;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class N_Queens {
    public static void main(String[] args) {
        int n = 5;
        char chessBoard[][] = new char[n][n];
        for(int i = 0; i < chessBoard.length; i++){
            for(int j = 0; j < chessBoard[0].length; j++){
                chessBoard[i][j] = '*';
            }
        }
        nQueens(chessBoard,0);
        System.out.println("Total ways to solve n queens : "+count);
    }
    public static int count = 0;

    public static void printBoard(char board[][]){
        System.out.println("-----------------Chess Board--------------");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][],int row, int col){
        //vertically up
        for(int i = row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //left diagonal up
        for(int i = row-1, j = col-1; i >=0 && j >= 0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //right diagonal up
        for(int i = row-1, j = col+1; i>=0 && j<board[col].length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row){

        if(row == board.length){
            printBoard(board);
            count++;
            return;
        }
        //column
        for(int j = 0; j < board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueens(board,row+1);
                board[row][j] = '*';
            }
        }
    }
}
