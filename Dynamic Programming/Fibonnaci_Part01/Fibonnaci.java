package Fibonnaci_Part01;

public class Fibonnaci {//O(n)
    //Memoization
    static int fibo(int n, int f[]){
        if(n == 0|| n==1){
            return n;
        }
        if(f[n] != 0){// fib(n) is already calculated
            return f[n];
        }
        f[n] = fibo(n-1, f)+fibo(n-2, f);
        return f[n];
    }
    //Tabulation
    static int fibTabulation(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        //print all fibonnaci
        for(int i = 0; i < dp.length; i++){
            System.out.print(dp[i]+" ");
        }
        System.out.println();
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 6;
        int f[] = new int[n+1];
        System.out.println(fibo(n, f));

        for(int i = 0; i < f.length; i++){
            System.out.print(f[i]+" ");
        }
        System.out.println();

        System.out.println(fibTabulation(n));
    }
}
