package BST;

public class PrintRange {
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

    public static void printInRange(Node root,int k1,int k2){
        if(root == null){
            return;
        }
        //case 1:If value is within the range [k1, k2], we print the value and recursively call the function for both left and right subtrees.
        if(root.data >= k1 && root.data <= k2){ 
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        //case 2:value <k1, then we skip leftsubtree and print rightsubtree
        //(No need to check leftSBT since all values will be less than k1 there)
        }else if(root.data < k1){
            printInRange(root.right,k1,k2);
        //case 3:value >k2, then we skip rightsubtree and print leftsubtree
        }else{
            printInRange(root.left,k1,k2);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.right = new Node(18);

        int k1 = 7;
        int k2 = 15;
        System.out.println("Values in the range ["+k1+", "+k2+"]:");
        printInRange(root, k1, k2);
        
    }
    
}
