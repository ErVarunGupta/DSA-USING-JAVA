package Lectures;
import Lectures.BST_Classroom.*;

import java.util.ArrayList;

public class ConvertBST_into_BalancedBST {

    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer> inorder, int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start + end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, start, mid-1);
        root.right = createBST(inorder, mid+1, end);
        return root;
    }

    public static Node balanceBST(Node root){
        //inorder seq
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root,inorder);

        //sorted inorder -> balanced BST
        root = createBST(inorder, 0, inorder.size()-1);
        return root;
    }

}
