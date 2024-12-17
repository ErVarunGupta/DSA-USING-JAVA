package Part_06;

import java.util.Arrays;

public class Matrix_Chain_Multiplication {
    //Recursion
    static int mcm(int arr[], int i, int j){
        if(i == j){
            return 0;
        }
        int minCost = Integer.MAX_VALUE;
        for(int k = i; k < j; k++){
            int cost1 = mcm(arr, i, k);//Ai...Ak => arr[i-1]*arr[k]
            int cost2 = mcm(arr, k+1, j);//Ai+1....Aj => arr[k]*arr[j]
            int cost3 = arr[i-1]*arr[k]*arr[j];
            int finalCost = cost1 + cost2 + cost3;
            minCost = Math.min(minCost, finalCost);
        }
        return minCost;
    }

    //Memoization
    static int mcmMemo(int arr[], int i, int j, int dp[][]){//O(n*n)
        if(i == j) return 0;
        int ans = Integer.MAX_VALUE;
        if(dp[i][j] != -1) return dp[i][j];

        for(int k = i; k < j; k++){
            int cost1 = mcmMemo(arr, i, k, dp);
            int cost2 = mcmMemo(arr, k+1, j, dp);
            int cost3 = arr[i-1]*arr[k]*arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        dp[i][j] = ans;
        return dp[i][j];
    }

    //Tabulation
    static int mcmTab(int arr[]){
        int n = arr.length;
        int dp[][] = new int[n][n];
        for(int i =0; i < n; i++){
            dp[i][i] = 0;
        }
        for(int len = 2; len < n; len++){
            for(int i = 1; i <= n-len; i++){
                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k= i; k < j; k++){
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1]*arr[k]*arr[j];
                    int finalCost = cost1 + cost2 + cost3;
                    dp[i][j] = Math.min(finalCost, dp[i][j]);
                }
            }
        }
        print(dp);
        return dp[1][n-1];
    }

    static void print(int dp[][]){
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};
        int n = arr.length;
        System.out.println(mcm(arr, 1, n-1));

        int dp[][] = new int[n][n];
        for(int i = 0; i < dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(mcmMemo(arr, 1, n-1, dp));

        System.out.println(mcmTab(arr));
    }
}
