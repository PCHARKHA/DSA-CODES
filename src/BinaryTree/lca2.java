//Optimized approach
package BinaryTree;

public class lca2 {
    static class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node lcaOptimized(Node root, int n1, int n2) {
        //case 0 - tree is empty
        if(root == null){
            return null;
        }
        //case 1 :Current node(root) is n1 or n2
        if(root.data == n1 || root.data == n2){
            return root;
        }
        //recursive calls
        Node left = lcaOptimized(root, n1, n2);
        Node right =lcaOptimized(root,n1,n2);
        
        //case 2: n1 and n2 are in different subtrees
        //basically ek value left mai mili aur ek right mai
        if (left != null && right != null) {
            return root;
        }

        //case 3:both lie in the same subtree
        if (left != null) {
            return left;
        } else {
            return right;
        }
    }
       
    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \   \
            4   5   6
        */
    
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
    
        int n1 = 4;
        int n2 = 5;
    
    }
}
