package Fibonnaci_Part01;

public class Climbing_Stairs {
    //Memoization - O(n)
    static int climbing_Ways(int n, int dp[]){
        if(n == 0||n == 1) return 1;
//        if(n == 0) return 1;
//        if(n < 0) return 0;

        if(dp[n] != 0){//already calculated
            return dp[n];
        }
        dp[n] = climbing_Ways(n-1, dp) + climbing_Ways(n-2, dp);
        return dp[n];
    }
    //Tabulation
    static int climbing_Ways1(int  n){
        int ways[] = new int[n+1];
        ways[0] = 1;
        ways[1] = 1;
        for(int i = 2; i <= n; i++){
            ways[i] = ways[i-1] + ways[i-2];
        }
        return ways[n];
    }

    static int climbing_Ways2(int n, int dp[]){
        if(n == 0) return 1;
        if(n == 1) return 1;
        if(n == 2) return 2;

        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = climbing_Ways2(n-1, dp) + climbing_Ways2(n-2, dp) + climbing_Ways2(n-3, dp);
        return dp[n];
    }

    static int tabulation_Ways(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < dp.length; i++){
            if(i == 2){
                dp[i] = dp[i-1] + dp[i-2];
            }
            else {
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        //Arrays.fill(dp,-1);
        System.out.println(climbing_Ways(n,dp));
        System.out.println(climbing_Ways1(n));
        // upto 3 stairs jumps
        int dp1[] = new int[n+1];
        System.out.println(climbing_Ways2(n, dp1));
        System.out.println(tabulation_Ways(n));
    }
}
