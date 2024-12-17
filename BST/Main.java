import java.util.ArrayList;

//import static Lectures.AVL_TREE.AVL_Tree.root;

public class Main {
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

   // public static Node root = null;

    public static TreeNode createBST(int arr[], int st, int end){
        if(st > end){
            return null;
        }

        int mid = (st + end)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }

    public static TreeNode mirror(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode leftMirror = mirror(root.left);
        TreeNode rightMirror = mirror(root.right);

        root.right = leftMirror;
        root.left = rightMirror;
        return root;
    }
//    public static void preorder(TreeNode root){
//        if(root == null){
//            return;
//        }
//        System.out.print(root.data+" ");
//        preorder(root.left);
//        preorder(root.right);
//    }
//
//    public static void inorder(TreeNode root){
//        if(root == null){
//            return;
//        }
//        inorder(root.left);
//        ans.add(root.data);
//        inorder(root.right);
//    }
//    static ArrayList<Integer> ans = new ArrayList<>();
//    public static int getMinimumDifference(TreeNode root) {
//
//        inorder(root);
//        System.out.println(ans);
//        int min = Integer.MAX_VALUE;
//        for(int i = 0; i < ans.size()-1; i++){
//            min = Math.min(Math.abs(ans.get(i+1)-ans.get(i)), min);
//        }
//        return min;
//    }




    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 10, 12};

        TreeNode root = createBST(arr, 0, arr.length-1);
//        preorder(root);
//        System.out.println();
//
//        root = mirror(root);
//        preorder(root);

//        System.out.println(getMinimumDifference(root));
    }

}
