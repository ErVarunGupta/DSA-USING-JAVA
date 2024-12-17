package Lectures;
import static Lectures.Classroom.*;

public class Search_In_Trie {       //O(L)
    public static boolean search(String key){
        Node curr = root;
        for(int level = 0; level < key.length(); level++){
            int indx = key.charAt(level) - 'a';
            if(curr.children[indx] == null){
                return false;
            }
            curr = curr.children[indx];
        }
        return curr.endOfWord;
    }
}
