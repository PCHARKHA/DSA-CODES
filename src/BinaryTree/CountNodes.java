package BinaryTree;

public class CountNodes {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){ //constructor
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1; //+1 for the current node
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // tree looks like this
        //         1  
        //       /   \
        //      2     3
        //      /   /   \
        //     4   5     6

        System.out.println("Number of nodes in the binary tree : "+count(root)); //6
        
    }
}
