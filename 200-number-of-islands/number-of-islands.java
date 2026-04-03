class Pair
{
    int first,second;
    Pair(int _f, int _s)
    {
        this.first=_f;
        this.second=_s;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int [][] vis=new int[n][m];
        int cnt=0;

        for(int row=0;row<n;row++)
        {
            for(int col=0;col<m;col++)
            {
                if(vis[row][col]==0 && grid[row][col]=='1')
                {
                    cnt++;
                    bfs(row,col,vis,grid);
                }
            }
        }
        return cnt;
    }
    public void bfs(int row,int col,int[][]vis,char[][]grid)
    {
        vis[row][col]=1;
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(row,col));
        int n=grid.length;
        int m=grid[0].length;

        while(!q.isEmpty())
        {
            int a=q.peek().first;
            int b=q.peek().second;
            q.remove();

            int[] delRow = {-1, 0, 1, 0};
int[] delCol = {0, 1, 0, -1};
            for (int i = 0; i < 4; i++) {
    int newr = a + delRow[i];
    int newc = b + delCol[i];
                
                    
                    if(newr>=0 && newr<n && newc>=0 && newc<m && grid[newr][newc]=='1' && vis[newr][newc]==0)
                    {
                        vis[newr][newc]=1;
                        q.add(new Pair(newr,newc));
                    }
                
            }
        }
    }
}