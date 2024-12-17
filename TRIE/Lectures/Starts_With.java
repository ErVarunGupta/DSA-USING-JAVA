package Lectures;

public class Starts_With {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i = 0; i < children.length; i++){
                this.children[i] = null;
            }
        }
    }
    static Node root = new Node();

    static void insert(String word){
        Node curr = root;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
            curr.eow = true;
        }
    }

    static boolean startsWith(String prefix){   //O(L)
        Node curr = root;
        for(int i = 0; i < prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        String prefix1 = "app";
        String prefix2 = "moon";

        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }

        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
    }
}
