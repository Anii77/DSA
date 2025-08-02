class Solution {
    public long minCost(int[] basket1, int[] basket2) {
       Map<Integer,Integer> freq=new HashMap<>();
       for(int a:basket1) freq.put(a,freq.getOrDefault(a,0)+1);
       for(int b:basket2) freq.put(b,freq.getOrDefault(b,0)-1);

       List<Integer> extra=new ArrayList<>();
       long minValue=Long.MAX_VALUE;

       for(Map.Entry<Integer,Integer> entry:freq.entrySet())
       {
        int fruit=entry.getKey();
        int count=entry.getValue();
        minValue=Math.min(minValue,fruit);

        if(count%2!=0) return -1;
        for(int i=0;i<Math.abs(count)/2;i++)
        {
            extra.add(fruit);
        }
       } 
       Collections.sort(extra);
   long cost=0;
   int n=extra.size();
   for(int i=0;i<n/2;i++)
   {
    cost+=Math.min(extra.get(i),2*minValue);
   }
   return cost;
    }

}