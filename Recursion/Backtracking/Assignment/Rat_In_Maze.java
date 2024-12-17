package Backtracking.Assignment;

public class Rat_In_Maze {
    public static void main(String[] args) {
        int n = 4;
        int maze[][] = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 1, 0},
                {1, 0, 1, 1}
        };
        int result[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                result[i][j] = 0;
            }
        }
        if(ratInMaze(maze,0,0,n,result)){
            System.out.println("Path found");
            print(result);
        }else{
            System.out.println("No any path");
        }
    }

    public static void print(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int maze[][], int x, int y,int n){
        if(x < n && y < n && maze[x][y] == 1){
            return true;
        }
        return false;
    }
    public static boolean ratInMaze(int maze[][], int x, int y,int n, int result[][]){
        if(x == n-1 &&  y == n-1){
            result[x][y] = 1;
            return true;
        }

        if(isSafe(maze,x,y,n)){
            result[x][y] = 1;
            if(ratInMaze(maze,x+1,y,n,result)){
                return true;
            }
            if(ratInMaze(maze,x,y+1,n,result)){
                return true;
            }
            result[x][y] = 0;
            return false;
        }
        return false;
    }
}
