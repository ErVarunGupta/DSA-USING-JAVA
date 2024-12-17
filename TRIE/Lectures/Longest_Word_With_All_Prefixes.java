package Lectures;

public class Longest_Word_With_All_Prefixes {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        Node(){
            for(int i = 0; i < 26; i++){
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
        }
        curr.eow = true;
    }

    static boolean search(String word){
        Node curr= root;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
    }

    public static String finalAns = "";

    static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }
        for(int i = 0; i < 26; i++){
            if(root.children[i] != null && root.children[i].eow){//root.eow == true
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length() > finalAns.length()){
                    finalAns = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1); //backtrack
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"a", "banana", "app","appl", "ap", "apply", "apple"};
        for(int i= 0; i < words.length;i++){
            insert(words[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(finalAns);
    }
}
