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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder=new ArrayList<Integer>();
        if(root==null) return preorder;
        Stack<TreeNode> st=new Stack<TreeNode>();
        st.add(root);
        while(!st.isEmpty())
        {
            TreeNode n=st.peek();
            preorder.add(st.pop().val);
            if(n.right!=null)
            st.add(n.right);
            if(n.left!=null)
            st.add(n.left);
        }
        return preorder;
    }
}