package Lectures.AVL_TREE;

public class AVL_Tree {
    public static class Node{
        int data;
        int height;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            height = 1;
        }
    }
    public static Node root;

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return root.height;
    }

    //Right rotate subtree rooted with y
    public static Node rightRotate(Node y){
//        Node x = y.left;
//        Node T2 = x.right;
//
//        //rotate using 3 nodes
//        x.right = y;
//        y.left = T2;

        Node x = y.left;
        y.left = x.right;
        x.right = y;

        //update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        //x is new root
        return x;
    }

    //left rotate subtree rooted with x
    public static Node leftRotate(Node x){
//        Node y = x.right;
//        Node T2 = y.left;
//
//        //rotation using 3 nodes
//        y.left = x;
//        x.right = T2;

        Node y = x.right;
        x.right = y.left;
        y.left = x;

        //update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        //y is new root
        return y;
    }

    //get balance of the node
    public static int getBalance(Node root){
        if(root == null){
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    public static Node insert(Node root, int key){
        if(root == null){
            return new Node(key);
        }

        if(key < root.data){
            root.left = insert(root.left, key);
        }
        else if(key > root.data){
            root.right = insert(root.right, key);
        }
        else{
            System.out.println("Duplicate key not allowed");
            return root;
        }

        //Update root height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // gets roots balance factor
        int bf = getBalance(root);

        //Left - left case
        if(bf > 1 && key < root.left.data){
            return rightRotate(root);
        }

        //Right - right case
        if(bf < -1 && key > root.right.data){
            return leftRotate(root);
        }

        //Left - right case
        if(bf > 1 && key > root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        //right - left case
        if(bf < -1 && key < root.right.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        preorder(root);
    }
}
