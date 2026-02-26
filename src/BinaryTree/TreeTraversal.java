//3 functions for tree traversal : Preorder, Inorder, Postorder
package BinaryTree;
public class TreeTraversal {
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
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        // we can add data in the way given below or we can write the buildtree function like in the PreorderBuild.java file
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Preorder Traversal : ");
        preorder(root); //1 2 4 5 3 6

        System.out.println("\nInorder Traversal : ");
        inorder(root); //4 2 5 1 3 6

        System.out.println("\nPostorder Traversal : ");
        postorder(root); //4 5 2 6 3 1
    }
}
