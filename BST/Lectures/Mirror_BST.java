package Lectures;
import Lectures.BST_Classroom.*;
public class Mirror_BST {
    public static Node mirror(Node root){
        if(root == null){
            return null;
        }

        Node leftMirror =  mirror(root.left);
        Node rightMirror = mirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }
}
