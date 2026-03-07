package BST;
public class MirrorBST {
    static class Node{
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        System.out.println("Original Tree:");
        printInOrder(root);

        mirror(root);

        System.out.println("\nMirrored Tree:");
        printInOrder(root);
    }

    public static void mirror(Node root) {
        if (root == null) {
            return;
        }
        // Recursively mirror the left and right subtrees
        mirror(root.left);
        mirror(root.right);

        // Swap the left and right children
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }
}