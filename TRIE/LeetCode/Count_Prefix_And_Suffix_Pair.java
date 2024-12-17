package LeetCode;

public class Count_Prefix_And_Suffix_Pair {
    public static  int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        for(int i = 0; i < words.length-1; i++){
            for(int j = i+1; j < words.length; j++){
                if(words[i].length() <= words[j].length()){
                    String pre = words[j].substring(0,words[i].length());
                    String suf = words[j].substring(words[j].length()-words[i].length());
                    if(words[i].equals(pre) && words[i].equals(suf)){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String words[] = {"a","aba","ababa","aa"};
        int ans = countPrefixSuffixPairs(words);
        System.out.println(ans);
    }
}
