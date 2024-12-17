package Backtracking.Assignment;

public class N_KnightsTour {
    public static void main(String[] args) {
        int n = 3;
        char chessBoard[][] = new char[n][n];
        for(int i = 0; i < chessBoard.length; i++){
            for(int j = 0; j < chessBoard[0].length; j++){
                chessBoard[i][j] = '*';
            }
        }
        if(n > 2){
            System.out.println(count);
            nKnights(chessBoard,0);
        }else{
            System.out.println("Knights move not possible");
        }

    }

    public static int count = 0;

    public static void printBoard(char chessBoard[][]){
        System.out.println("----------Chess Board------------");
        for(int i = 0; i < chessBoard.length; i++){
            for(int j = 0; j < chessBoard[0].length; j++){
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void nKnights(char board[][], int row){
        if(row == board.length){
            printBoard(board);
            count++;
            return;
        }

        for(int j = 0; j < board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'K';
                nKnights(board,row+1);
                board[row][j] = '*';
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col){
        int n = board.length;
        int m = board[0].length;
        if(row >= 2 && col >= 1 && board[row-2][col-1] == 'K'){
            return false;
        }
        if(row >= 1 && col >= 2 && board[row-1][col-2] == 'K'){
            return false;
        }

        if(row >= 2 && col < n-1 && board[row-2][col+1] == 'K'){
            return false;
        }
        if(row >= 1 && col < n-2 && board[row-1][col+2] == 'K'){
            return false;
        }
        return true;
    }
}
