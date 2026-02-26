//Height of the binary tree : maximum distance from root to leaf node

package BinaryTree;
public class Height {
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
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1; //+1 for the current node
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


        System.out.println("Height of the binary tree : "+height(root)); //3
    }
    
}
