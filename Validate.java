// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Perform an inorder traversal . If we have a current root element, which is smaller than prev , then it means it is not BST.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Validate {
    
    TreeNode prev;
    boolean isValid;
    public boolean isValidBST(TreeNode root) {
       
    isValid=true;
    inorder(root);
    return isValid;
    }
        
    public void inorder(TreeNode root)
    {
        if(root==null)
            return ;
        
        inorder(root.left);
        
        if(prev!=null && root.val<=prev.val) 
            isValid=false;
        
        prev=root;
        
        inorder(root.right);
        
    }
    
}