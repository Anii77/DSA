class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int []result;
        int c=0;
        if(n>m) result=new int[m];
        else result=new int[n];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
    {
        if(nums1[i]==nums2[j])
        {
            if(c==0 || result[c-1]!=nums1[i])
            result[c++]=nums1[i];
            i++;j++;
        }
        else if(nums1[i]<nums2[j]) i++;
        else j++;
    }
  return Arrays.copyOf(result, c);
    }
}