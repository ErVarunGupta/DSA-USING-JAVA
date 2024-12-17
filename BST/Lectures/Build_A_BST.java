package Lectures;

import Lectures.BST_Classroom.*;

import static Lectures.BST_Classroom.list;

public class Build_A_BST {
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.data){    //left subtree
            root.left = insert(root.left, val);
        }else if(val > root.data){
            root.right =  insert(root.right, val);
        }else{              //right subtree
            System.out.println("Duplicate data can not be inserted");
            return root;
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        list.add(root.data);
        inorder(root.right);
    }

    //preorder
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}
