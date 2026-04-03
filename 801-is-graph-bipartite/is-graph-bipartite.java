class Solution {
    public boolean isBipartite(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        int n=graph.length;
        int m=graph[0].length;

        for(int i=0;i<n;i++)
        adj.add(new ArrayList<>());

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<graph[i].length;j++)
            {
                adj.get(i).add(graph[i][j]);
            }
        }
        int V=adj.size();
        int []color=new int[V];
        for(int i=0;i<V;i++)
        color[i]=-1;

        for(int i=0;i<V;i++)
        {
            if(color[i]==-1)
            {
                if(checkCycle(i,n,adj,color)==false)
                    return false;
            }
        }
        return true;
    }
    public boolean checkCycle(int node,int V,ArrayList<ArrayList<Integer>>a,int[]color)
    {
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(node);
        color[node]=0;
        while(!q.isEmpty())
        {
            int st=q.remove();
            for(Integer t:a.get(st))
            {
                if(color[t]==-1)
                {
                    color[t]=1-color[st];
                    q.add(t);
                }
                else if(color[t]==color[st])
                {
                    return false;
                }
            }
            
        }
        return true;
    }
}