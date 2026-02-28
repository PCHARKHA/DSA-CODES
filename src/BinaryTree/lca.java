//Lowest common ancestor between 2 nodes n1 and n2
package BinaryTree;
import java.util.ArrayList;

public class lca {
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
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
    
        // add current node to path
        path.add(root);
    
        // check if current node is target
        if (root.data == n) {
            return true;
        }
    
        // recursive calls
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
    
        // if found in either subtree, keep current node in path
        if (foundLeft || foundRight) {
            return true;
        }
    
        // not found → backtrack
        path.remove(path.size() - 1);
        return false;
    }
    //Main qs ka function
    public static Node lowca(Node root,int n1,int n2){
        //Step 1:Path from root to Node
        ArrayList<Node> path1= new ArrayList<>();
        ArrayList<Node> path2= new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root ,n2,path2);

        //Step 2: To find last(lowest) common ancestor through traversal
        int i =0;
        for(i=0;i<path1.size() && i<path2.size();i++){
            if(path1.get(i) != path2.get(i)){ //same hai tab tak chalo
                break;
            }
        }
        //last equal node lies at index i-1
        Node ans= path1.get(i-1);
        return ans;

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
        
            Node lca = lowca(root, n1, n2);
        
            if (lca != null) {
                System.out.println("LCA of " + n1 + " and " + n2 + " is: " + lca.data);
            } else {
                System.out.println("LCA not found");
            }
        }
    }


