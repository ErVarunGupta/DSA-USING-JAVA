package Part_04;

public class Edit_Distance {
    static int editDistance(String word1, String word2){
        int n = word1.length();
        int m = word2.length();

        int dp[][] = new int[n+1][m+1];
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < m+1; j++){
                if(i == 0) dp[i][j] = j;
                if(j == 0) dp[i][j] = i;
            }
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < m+1; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){//same
                    dp[i][j] = dp[i-1][j-1];
                }
                else{//diff
                    int add = dp[i][j-1] + 1;
                    int del = dp[i-1][j] + 1;
                    int rep = dp[i-1][j-1] + 1;
                    dp[i][j] = Math.min(add, Math.min(del, rep));
                }
            }
        }
        for(int i =0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";

        System.out.println(editDistance(word1, word2));
    }
}
