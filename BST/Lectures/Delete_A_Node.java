package Lectures;
import Lectures.BST_Classroom.*;

public class Delete_A_Node {
    public static Node inorderSuccerssor(Node root){
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }else if(root.data > val){
            root.left = delete(root.left, val);
        }else{
            //case 1 : No children
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2 : one child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //case 3 : two children
            Node iSec = inorderSuccerssor(root);
            root.data = iSec.data;
            root.right = delete(root.right, iSec.data);
        }
        return root;
    }
}
