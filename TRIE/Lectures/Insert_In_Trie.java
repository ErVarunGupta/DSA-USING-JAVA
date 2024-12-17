package Lectures;
import static Lectures.Classroom.*;


public class Insert_In_Trie {   //O(L)  L - length of largest word
    public static void insert(String word){
        Node curr = root;
        for(int level = 0; level < word.length(); level++){
            int indx = word.charAt(level) - 'a';
            if(curr.children[indx] == null){
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
        }

        curr.endOfWord = true;
    }
}
