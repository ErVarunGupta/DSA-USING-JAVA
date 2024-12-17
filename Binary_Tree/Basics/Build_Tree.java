package Basics;

import java.util.LinkedList;
import java.util.Queue;

public class Build_Tree {
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

    static class BinaryTree{
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

        //preorder
        public static void preorder(Node root){     //O(n)
            if(root == null){
                System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        //postorder
        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        //inorder
        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        /// Level order traversal (BFS)
        public static void leverOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else {
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        //Height of tree
        public static int heightOfTree(Node root){
            if(root == null){
                return 0;
            }

            int lh = heightOfTree(root.left);
            int rh = heightOfTree(root.right);

            return Math.max(lh, rh) + 1;
        }

        //Count of nodes
        public static int countOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftCount = countOfNodes(root.left);
            int rightCount = countOfNodes(root.right);

            return (leftCount + rightCount) + 1;
        }

        //Sum of nodes
        public static int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }

            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);

            return (leftSum + rightSum + root.data);
        }

        //Diameter of a Tree
        public static int diameterOfTree(Node root){  //O(n^2)
            if(root == null){
                return 0;
            }

            int lDiameter = diameterOfTree(root.left);
            int rDiameter = diameterOfTree(root.right);

            int lh = heightOfTree(root.left);
            int rh = heightOfTree(root.right);

            int selfDiameter = (lh + rh + 1);
            //int max = Math.max(lDiameter, rDiameter);

            return Math.max(selfDiameter, Math.max(lDiameter, rDiameter));
        }

        //2nd Approach for calculate diameter

        static class Info{
            int diam;
            int ht;

            Info(int diam, int ht){
                this.diam = diam;
                this.ht = ht;
            }
        }

        public static Info diameter(Node root){  //O(n)
            if(root == null){
               return new Info(0, 0);
            }
            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);

            int diam = Math.max(Math.max(leftInfo.diam , rightInfo.diam),  leftInfo.ht + rightInfo.ht + 1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new Info(diam,ht);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        System.out.println("preoreder : ");
        tree.preorder(root);

        System.out.println("\npostorder : ");
        tree.postorder(root);

        System.out.println("\ninorder : ");
        tree.inorder(root);

        System.out.println("\nlevel order traversal : ");
        tree.leverOrder(root);

        System.out.println("Height of tree : ");
        System.out.println(tree.heightOfTree(root));

        System.out.println("Count of Nodes : ");
        System.out.println(tree.countOfNodes(root));

        System.out.println("Sum of Nodes : ");
        System.out.println(tree.sumOfNodes(root));

        System.out.println("Diameter of tree : ");
        System.out.println(tree.diameterOfTree(root));

        System.out.println("Diameter of tree from object : ");
        System.out.println(tree.diameter(root).diam);

        System.out.println("Height of tree by object : ");
        System.out.println(tree.diameter(root).ht);
    }
}
