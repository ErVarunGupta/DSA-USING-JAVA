package Assignment;

import java.util.Scanner;

public class Univalued_Or_Not {
    public static class Node{
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

//    public static void buildTree(Scanner sc, Node root){
//        System.out.println("Do you want to insert left data  in : "+root.data+" : ");
//        char left = sc.next().charAt(0);
//        if(left == 'y'|| left == 'Y'){
//            System.out.println("Enter the left value of "+root.data+" : ");
//            int data = sc.nextInt();
//            root.left = new Node(data);
//            buildTree(sc, root.left);
//        }
//
//        System.out.println("Do you want to insert right data in "+root.data+" : ");
//        char right = sc.next().charAt(0);
//        if(right == 'y'||right == 'Y'){
//            System.out.println("Enter the right value of "+root.data+" : ");
//            int data = sc.nextInt();
//            root.right = new Node(data);
//            buildTree(sc, root.right);
//        }
//    }

    static int idx = -1;
    public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }

        Node newNode  = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    static void preorder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static boolean isUnivalued(Node root){
        if(root == null){
            return true;
        }
        if(root.left != null && root.data != root.left.data){
            return false;
        }
        if(root.right != null && root.data != root.right.data){
            return false;
        }
        return isUnivalued(root.left) && isUnivalued(root.right);
    }

    public static Node invert(Node root){
        if(root == null){
            return null;
        }
        Node left = invert(root.left);
        Node right = invert(root.right);

        root.left = right;
        root.right = left;
        return root;
    }

    public static Node deleteLeaf(Node root, int x){
        if(root == null){
            return null;
        }
        if(root.left == null && root.right == null && root.data == x){
            return null;
        }
         root.left = deleteLeaf(root.left, x);

         root.right = deleteLeaf(root.right, x);
        return root;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the root data ; ");
//        int value = sc.nextInt();
//        root = new Node(value);
       // buildTree(sc, root);

        int arr[]  = {1, 1, 1, -1, -1, 1, -1, -1, 1, -1, -1};
        root = buildTree(arr);
        preorder(root);
        System.out.println();

        System.out.println(isUnivalued(root));
        System.out.println();

//        Node ans = invert(root);
//        preorder(ans);

        System.out.println();
        Node result = deleteLeaf(root, 3);
        preorder(result);
    }
}
