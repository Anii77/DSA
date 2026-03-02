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
class Solution {
     int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
       
        findMax(root);
        return max;
        
    }
    public int findMax(TreeNode root)
    {
        if(root==null) return 0;
        int l=findMax(root.left);
        int r=findMax(root.right);
        max=Math.max(max,l+r);
        return 1+Math.max(l,r);
    }
}