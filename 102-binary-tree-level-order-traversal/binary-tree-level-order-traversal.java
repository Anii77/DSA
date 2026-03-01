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
    public List<List<Integer>> levelOrder(TreeNode root) {
       Queue<TreeNode> q=new LinkedList<TreeNode>();
       List<List<Integer>>ans=new LinkedList<List<Integer>>();
       if(root==null) return ans;
       q.add(root);
       while(!q.isEmpty())
       {
        int l=q.size();
        List<Integer> sub=new LinkedList<Integer>();
        for(int i=0;i<l;i++)
        {
            if(q.peek().left!=null) q.add(q.peek().left);
            if(q.peek().right!=null) q.add(q.peek().right);
            sub.add(q.poll().val);

        }
        ans.add(sub);
       } 
       return ans;
    }
}