// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

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
class ConstructTree {
    int pindex;
    HashMap<Integer,Integer>map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
   
    map=new HashMap<>();

    //Build Hashmap for inorder array elements and its index.

    for(int i=0;i<inorder.length;i++)
    {
        map.put(inorder[i],i);
    }
    
       return helper(preorder,0,preorder.length-1);
        
    }
    
    
    public TreeNode helper(int[] preorder,int start,int end)
    {
        
        if(start>end) return null;
        
        // Root is always the 1st element in preorder array at that point of time
        int rootvalue=preorder[pindex++];
        TreeNode root = new TreeNode(rootvalue);
        
        // Find the location of the root in inorder array. All the left subtree elements would be left of the location/index.
        // All right subtree elements would be on right of inorder array.
        
        root.left=helper(preorder,start,map.get(rootvalue)-1);
        root.right=helper(preorder,map.get(rootvalue)+1,end);
        
        return root;
        
    }
}