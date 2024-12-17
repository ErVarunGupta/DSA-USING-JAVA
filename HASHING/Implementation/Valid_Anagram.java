package Implementation;

import java.util.HashMap;

public class Valid_Anagram {//O(n)
    static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
//        System.out.println(hm);

//        Set<Character> keys = hm.keySet();
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(hm.containsKey(ch)){
                if(hm.get(ch) == 1){
                    hm.remove(ch);
                }else{
                    hm.put(ch, hm.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return hm.isEmpty();
    }
    public static void main(String[] args) {
        String s = "knee";
        String t = "neet";

        boolean ans = isAnagram(s, t);
        System.out.println(ans);
    }

}
