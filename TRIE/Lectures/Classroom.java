package Lectures;
import static Lectures.Insert_In_Trie.*;
import static Lectures.Search_In_Trie.*;
import static Lectures.Word_Break.*;

public class Classroom {
    static class Node{
        Node children[] = new Node[26];
        boolean endOfWord = false;

        Node(){
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();


    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};

        //insert in trie
        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }

        //search in trie
        System.out.println(search("thee"));
        System.out.println(search("thor"));

        //word break
        String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for(int i = 0; i < arr.length; i++){
            insert(arr[i]);
        }

        String key = "ilikesam";
        System.out.println(wordBreak(key));
    }
}
