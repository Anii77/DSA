class Solution {
    public long minCost(int[] basket1, int[] basket2) {
       Map<Integer,Integer> totalCounts=new HashMap<>();
       for(int a:basket1) totalCounts.put(a,totalCounts.getOrDefault(a,0)+1);
       for(int b:basket2) totalCounts.put(b,totalCounts.getOrDefault(b,0)+1);

       long minVal=Long.MAX_VALUE;
       for(Map.Entry<Integer,Integer> entry:totalCounts.entrySet())
       {
        if(entry.getValue()%2!=0) return -1;
        minVal=Math.min(minVal,entry.getKey());
       } 
       List<Long> fruits=new ArrayList<>();
       Map<Integer,Integer> count1=new HashMap<>();
       for(int i:basket1)
       count1.put(i,count1.getOrDefault(i,0)+1);

       for(Map.Entry<Integer,Integer> entry:totalCounts.entrySet())
       {
        int fruit=entry.getKey();
        int diff=count1.getOrDefault(fruit,0)-(entry.getValue()/2);
       
        for(int i=0;i<Math.abs(diff);i++)
        {
            fruits.add((long)fruit);
        }
       }
        Collections.sort(fruits);

        long total=0;
        int swaps=fruits.size()/2;
        for(int i=0;i<swaps;i++)
        {
            total+=Math.min(fruits.get(i),2*minVal);
        }
      
       
         return total;
    }
}