package Part_04;

public class String_Conversion {
    static int lcs(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < m+1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    static int stringConversion(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int lcs = lcs(str1, str2);
        return (n-lcs)+(m-lcs);
    }

    static int stringConversion2(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < m+1; j++){
                if(i == 0) dp[i][j] = j;
                if(j == 0) dp[i][j] = i;
            }
        }
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < m+1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    int add = dp[i][j-1];
                    int det = dp[i-1][j];
                    dp[i][j] = Math.min(add, det)+1;
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "aceg";
        System.out.println(lcs(str1, str2));
        System.out.println(stringConversion(str1, str2));
        System.out.println(stringConversion2(str1, str2));
    }
}
