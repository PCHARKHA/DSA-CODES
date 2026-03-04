package BST;

public class ValidBST {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isValidBST(TreeNode root,TreeNode min,TreeNode max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        if(max != null && root.data >= max.data){
            return false;
        }
        // Recursively check the left subtree with updated max and the right subtree with updated min
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    /*Code for leetCode variant
    public static boolean isValidBST(TreeNode root){
        return isValidBST(root, null, null);
        
    }
    
    
    
    
    */

    
}
