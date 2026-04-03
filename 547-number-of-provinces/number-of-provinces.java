class Solution {
    public void dfs(int node,ArrayList<ArrayList<Integer>>adj,int[]vis)
    {
        vis[node]=1;
        for(Integer it:adj.get(node))
        {
            if(vis[it]==0)
            {
                dfs(it,adj,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
        {
           adj.add(new ArrayList<Integer>());
           for(int j=0;j<n;j++)
           {
            if(isConnected[i][j]==1 && i!=j)
            {
                adj.get(i).add(j);
            }
           }
        }
        int count=0;
        int []vis=new int[n];
for(int i=0;i<n;i++)
{
 if(vis[i]==0) 
 {
    count++;
    dfs(i,adj,vis);
 }  
}
return count;
    }
}