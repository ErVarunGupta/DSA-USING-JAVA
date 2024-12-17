package Lectures;
import Lectures.BST_Classroom.*;
public class Balance_BST {
    public static Node createBST(int arr[], int start, int end){
        if(start > end){
            return null;
        }
        int  mid = (start + end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, start, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }

}
