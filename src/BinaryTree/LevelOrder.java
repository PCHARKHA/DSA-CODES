
//level order traversal : (ie, from left to right, level by level).
package BinaryTree;

public class LevelOrder {
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

    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        java.util.Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);
        q.add(null); //marker for end of level

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){ //end of level
                System.out.println(); //move to next line
                if(q.isEmpty()){
                    break; //if queue is empty, break the loop
                }else{
                    q.add(null); //add marker for next level
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Level Order Traversal : ");
        levelOrder(root); //1 \n 2 3 \n 4 5 6
    }
    
}
