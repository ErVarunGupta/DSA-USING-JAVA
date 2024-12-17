package Part_06;

public class Minimum_Different {
    static int minDiff(int nums[]){//O(n*W)
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }

        int W = sum/2;
        //0-1 Knapsack problem like
        int dp[][] = new int[n+1][W+1];
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < W+1; j++){
                if(nums[i-1] <= j){//valid
                    dp[i][j] = Math.max(nums[i-1] + dp[i-1][j-nums[i-1]], dp[i-1][j]);
                }else{//invalid
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int sum1 = dp[n][W];
        int sum2 = sum-sum1;
        return Math.abs(sum2-sum1);
    }
    public static void main(String[] args) {
        int nums[] = {1, 6, 11, 5};
        System.out.println(minDiff(nums));
    }
}
