//Approach 2- O(n)
package BinaryTree;
public class Diameter1 {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class TreeInfo{
        int diameter;
        int height;

        public TreeInfo(int diameter, int height){
            this.diameter = diameter;
            this.height = height;
        }
    }
    public static void calcDiameter(Node root, TreeInfo treeInfo){
        if(root == null){
            treeInfo.diameter = 0;
            treeInfo.height = 0;
            return;
        }
        TreeInfo leftTreeInfo = new TreeInfo(0, 0);
        TreeInfo rightTreeInfo = new TreeInfo(0, 0);
        calcDiameter(root.left, leftTreeInfo);
        calcDiameter(root.right, rightTreeInfo);
        int selfDiameter = leftTreeInfo.height + rightTreeInfo.height + 1;
        treeInfo.diameter = Math.max(selfDiameter, Math.max(leftTreeInfo.diameter, rightTreeInfo.diameter));
        treeInfo.height = Math.max(leftTreeInfo.height, rightTreeInfo.height) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        TreeInfo treeInfo = new TreeInfo(0, 0);
        calcDiameter(root, treeInfo);
        System.out.println("Diameter of the tree is: " + treeInfo.diameter);
    }
    
}
