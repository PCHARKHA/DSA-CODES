package BST;
import java.util.ArrayList;
public class RoottoLef {
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

    public static void pathRoot2Leaf(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        //leaf node
        if(root.left == null && root.right == null){
            System.out.println(path);
        }else{
            pathRoot2Leaf(root.left, path);
            pathRoot2Leaf(root.right, path);
        }
        //backtracking step
        path.remove(path.size()-1);
    }
    

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        root.right.right.right=new Node(14);

        ArrayList<Integer> path = new ArrayList<>();
        System.out.println("Root to leaf paths:");
        pathRoot2Leaf(root, path);
    }
}
