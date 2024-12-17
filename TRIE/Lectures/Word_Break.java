package Lectures;
import static Lectures.Classroom.*;
import static Lectures.Search_In_Trie.search;

public class Word_Break {       //O(L)
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }

        for(int i = 1; i <= key.length(); i++){
            if(search(key.substring(0, i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
}
