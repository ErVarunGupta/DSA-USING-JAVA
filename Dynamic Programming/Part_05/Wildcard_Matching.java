package Part_05;

public class Wildcard_Matching {//O(n*m)
    static boolean wildcardMatching(String s, String p){
        int n = s.length();
        int m = p.length();

        //create dp[][] table array
        boolean dp[][] = new boolean[n+1][m+1];

        //Initialization
        //s == " " && p == " "
        dp[0][0] = true;
        //s != " " && p == " "
        for(int i = 1; i < n+1; i++){
            dp[i][0] = false;
        }
        //s == " " && p != " "
        for(int j = 1; j < m+1; j++){
            if(p.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            }
        }

        //fill buttom up
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < m+1; j++){
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }else if(p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                }else{
                    dp[i][j] = false;
                }
            }
        }

        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < m+1; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
//      string -> n, pattern -> m
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s = "aa";
        String p = "*";

        System.out.println(wildcardMatching(s, p));
    }
}
