//Diameter is the number of nodes in th largest path between any two nodes in the tree
//time complexity : O(n^2) because for each node we are calculating height which takes O(n) time and
// we are doing this for all nodes in the tree which takes O(n) time. So overall time complexity is O(n^2).
package BinaryTree;

public class Diamter {
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
    
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight)+1;
    }

    public static int calcDiameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDiameter = calcDiameter(root.left);
        int rightDiameter = calcDiameter(root.right);
        int selfDiameter = height(root.left) + height(root.right)+1;
        /* Cases :1. diameter lies in left subtree  2. diameter lies in right subtree 
        3. diameter passes through root node 
        We return maximum of these three cases as the diameter of the tree.
        */
        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Diameter of the tree is: " + calcDiameter(root));
    }
    
}
