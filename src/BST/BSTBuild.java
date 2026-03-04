package BST;

/*  QS 1)Constructing a BST from a given array of values. The first value in the array will be the root of the BST, 
 and the subsequent values will be inserted into the BST according to the standard rules of BST.
 QS 2)Search on BST
 */
public class BSTBuild{
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
    //Method to construct the BST from the given array of values
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            // left subtree
            root.left = insert(root.left, val);
        }else{
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }
    //method to check if BST is correctly constructed or not
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    //method to search a key in the BST
    public static boolean search(Node root,int key){
        if (root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            // left subtree
            return search(root.left, key);
        }else{
            //right subtree
            return search(root.right, key);
        }
    }
    
    public static void main(String[] args) {
        int values[] = {8,5,3,6,10,11};
        Node root = null;
        //loop to insert values in the BST
        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        //to check the answer
        inorder(root);

        //searching a key in the BST
        int key = 10;
        if(search(root, key)){
            System.out.println("\nKey "+key+" found in the BST");
        }else{
            System.out.println("\nKey "+key+" not found in the BST");
        }
    }
}