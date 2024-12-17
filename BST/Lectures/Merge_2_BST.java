package Lectures;

import java.util.ArrayList;

public class Merge_2_BST {
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

    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left,inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer> arr, int st, int end){
        if(st > end){
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(arr.get(mid));

        root.left =  createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);

        return root;
    }

    public static Node mergeBST(Node root1, Node root2){
        //step1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1,arr1);

        //step2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        //merge
        int i = 0;
        int j = 0;

        ArrayList<Integer> arr = new ArrayList<>();
        while(i < arr1.size() && j < arr2.size()){
            if(arr1.get(i) < arr2.get(j)){
                arr.add(arr1.get(i));
                i++;
            }else{
                arr.add((arr2.get(j)));
                j++;
            }
        }
        while(i < arr1.size()){
            arr.add(arr1.get(i));
            i++;
        }
        while(j < arr2.size()){
            arr.add(arr2.get(j));
            j++;
        }

        //sorted array to balanced bst
        return createBST(arr ,0, arr.size()-1);
    }

    public static void main(String[] args) {
        //1 BST
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        //2nd BST
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);
        preorder(root);
    }
}
