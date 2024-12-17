package Lectures;
import Lectures.BST_Classroom.*;

public class Search_In_BST {        //O(H)
    //Searching in BST
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        else if(root.data > key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }

}
