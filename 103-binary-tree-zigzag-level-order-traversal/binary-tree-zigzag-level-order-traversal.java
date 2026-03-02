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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root==null) return ans;
        q.add(root);
        boolean flag=true;
        while(!q.isEmpty())
        {
            int l=q.size();
            List<Integer> a=new ArrayList<Integer>();
            for(int i=0;i<l;i++)
            {
                if(q.peek().left!=null)
                q.add(q.peek().left);
                if(q.peek().right!=null)
                q.add(q.peek().right);
                if(flag==true)
                a.add(q.poll().val);
                else
                a.add(0,q.poll().val);
            }
            flag=!flag;
            ans.add(a);
        }
        return ans;
    }
}