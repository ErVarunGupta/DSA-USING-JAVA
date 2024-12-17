package Part_02;

public class target_sum {//O(n*sum)

    static void print(boolean dp[][]){
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[i].length; j++){
                System.out.print(dp[i][j] + " | ");
            }
            System.out.println();
        }
    }

    static boolean targetSum(int num[], int sum){
        int n = num.length;
        boolean dp[][] = new boolean[n+1][sum+1];
//        i = items & j = target sum
        for(int i = 0; i < n+1; i++){
            dp[i][0] = true;
        }

        for(int i = 1; i < n+1; i++){
            int v = num[i-1];
            for(int j = 1; j < sum+1; j++){
                if(v <= j && dp[i-1][j-v]){//include
                    dp[i][j] = true;
                }else if(dp[i-1][j]){//exclude
                    dp[i][j] = true;
                }
            }
        }
        print(dp);
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int num[] = {4, 2, 7, 1, 3};
        int targetSum = 10;

        System.out.println(targetSum(num, targetSum));
    }
}
