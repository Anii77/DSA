class Solution {

    public static int ncr(int n,int c)
    {
        long res=1;
        for(int i=0;i<c;i++)
        {
            res=res*(n-i);
            res=res/(i+1);
        }
        return (int)res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> gen=new ArrayList<>();

        for(int row=1;row<=numRows;row++)
        {
            List<Integer> temp=new ArrayList<Integer>();
            for(int col=1;col<=row;col++)
            {
                temp.add(ncr(row-1,col-1));
            }
            gen.add(temp);
        }
        return gen;
    }
}