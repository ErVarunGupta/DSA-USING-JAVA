package Backtracking;

public class GridWays { //TC - O(n*n!)
    public static void main(String[] args) {
        int n = 3, m = 3;
        int ans = gridWays(0,0,n,m);
        System.out.println(ans);
    }
    public static int gridWays(int i, int j, int n, int m){
        //base case
        if(i == n-1 && j == m-1){ // condition for last cell
            return 1;
        }else if(i == n || j == n){ // boundary condition
            return 0;
        }

        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1 + w2;
    }
}
