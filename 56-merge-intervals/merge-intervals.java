class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>> ans=new ArrayList<>();
        for(int []a:intervals)
        {
            if(ans.isEmpty() || ans.get(ans.size()-1).get(1)<a[0])
            {
                ans.add(Arrays.asList(a[0],a[1]));
            }
            else
            {
                int b=ans.size()-1;
                int maxEnd=Math.max(a[1],ans.get(b).get(1));
                ans.get(b).set(1,maxEnd);
            }
        }

        int[][] result = new int[ans.size()][2];

        for (int i = 0; i < ans.size(); i++) {
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }

        return result;
    }
}