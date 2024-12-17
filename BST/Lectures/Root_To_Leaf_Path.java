package Lectures;
import Lectures.BST_Classroom.*;

import java.util.ArrayList;

public class Root_To_Leaf_Path {
    private static void printPath(ArrayList<Integer> path){
        for(int i = 0; i < path.size(); i++){
            System.out.print(path.get(i)+" -> ");
        }
        System.out.println("Null");
    }
    public static void rootToLeafPath(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
       

        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        rootToLeafPath(root.left,path);
        rootToLeafPath(root.right,path);
        path.remove(path.size()-1);
    }
}
