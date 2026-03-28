class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int [][] ans=new int[n][2];
        for(int i=0;i<n;i++)
        {
            ans[i][0]=nums[i];
            ans[i][1]=i;
        }
        Arrays.sort(ans,(a,b)->Integer.compare(a[0],b[0]));
        int left=0,right=n-1;
        while(left<right)
        {
            int sum=ans[left][0]+ans[right][0];
            if(sum==target)
            {
                return new int[]{ans[left][1],ans[right][1]};
            }
            else if(sum>target)
            {
                right--;
            }
            else left++;
        }
        return new int[]{-1,-1};
    }
}