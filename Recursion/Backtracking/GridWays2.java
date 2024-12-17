package Backtracking;

public class GridWays2 { // TC - O(n)
    public static void main(String[] args) {
        int ans = gridWays(2,2);
        System.out.println(ans);
    }
    public static int gridWays(int n, int m){
        return fact(n-1 + m-1)/(fact(n-1) * fact(m-1));
    }

    public static int fact(int n){
        if(n == 0|| n == 1){
            return n;
        }
        return n * fact(n-1);
    }
}
