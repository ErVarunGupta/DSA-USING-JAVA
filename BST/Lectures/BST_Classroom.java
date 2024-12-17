package Lectures;
import java.util.ArrayList;

import static Lectures.Build_A_BST.*;
import static Lectures.Delete_A_Node.*;
import static Lectures.Mirror_BST.mirror;
import static Lectures.Print_In_Range.printInRange;
import static Lectures.Root_To_Leaf_Path.*;
import static Lectures.Search_In_BST.*;
import static Lectures.Validate_BST.*;
import static Lectures.Balance_BST.*;
import static Lectures.ConvertBST_into_BalancedBST.*;

public class BST_Classroom {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node root = null;

    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
//        int values[] = {5, 3, 7, 2, 4, 6, 8};
//
//        for(int i = 0; i < values.length; i++){
//            root = insert(root, values[i]);
//        }

//        inorder(root);
//        System.out.println();

        //Search in BST class
//        System.out.println(search(root,3));
//        if(search(root,4)){
//            System.out.println("Found");
//        }else {
//            System.out.println("Not found");
//        }


        //Delete a node class
//        root = delete(root,5);
//        inorder(root);
//        System.out.println();

        //Print in range
//        printInRange(root,2,7);
//        System.out.println();

        //root to leaf path
//        rootToLeafPath(root,new ArrayList<>());

        //BST is valid or not
//        if(isValidBST(root, null, null)){
//            System.out.println("valid");
//        }else{
//            System.out.println("not valid");
//        }

        //mirror of BST
//        preorder(root);
//        System.out.println();
//        root = mirror(root);
//        preorder(root);
//        System.out.println();

        //balenced bst
//        int arr[] = {3, 5, 6, 8, 10, 11, 12};
//        root = createBST(arr,0,arr.length-1);
//        preorder(root);

        // converted BALANCED BST
        int array[] = {236,104,701,227,911};
        for(int i = 0; i < array.length; i++){
            root = insert(root, array[i]);
        }

        inorder(root);
        System.out.println();
        System.out.println(list);
//        root = balanceBST(root);
//        preorder(root);

    }
}
