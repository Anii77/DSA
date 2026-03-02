/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
public void markParent(TreeNode root,Map<TreeNode,TreeNode> parent,TreeNode target)
{
    Queue<TreeNode> q=new LinkedList<TreeNode>();
    q.add(root);
    while(!q.isEmpty())
    {
        TreeNode current=q.poll();
        if(current.left!=null)
        {
            parent.put(current.left,current);
            q.add(current.left);
        }
        if(current.right!=null)
        {
            parent.put(current.right,current);
            q.add(current.right);
        }
    }
}

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parent=new HashMap<>();
        markParent(root,parent,root);
        Map<TreeNode,Boolean>visited=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(target);
        visited.put(target,true);
        int cur_level=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            if(cur_level==k) break;
            cur_level++;
            for(int i=0;i<size;i++)
            {
                TreeNode current=q.poll();
                if(current.left!=null && visited.get(current.left)==null)
                {
                    q.add(current.left);
                    visited.put(current.left,true);
                }
                if(current.right!=null && visited.get(current.right)==null)
                {
                    q.add(current.right);
                    visited.put(current.right,true);
                }
                if(parent.get(current)!=null && visited.get(parent.get(current))==null)
                {
                    q.add(parent.get(current));
                    visited.put(parent.get(current),true);
                }
            }
        }
        List<Integer> result=new ArrayList<Integer>();
        while(!q.isEmpty())
        {
            TreeNode a=q.poll();
            result.add(a.val);
        }
        return result;

    }
}