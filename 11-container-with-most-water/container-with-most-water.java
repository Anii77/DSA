class Solution {
    public int maxArea(int[] height) {
        int maxA=0;
        int l=0,r=height.length-1;
        while(l<r)
        {
            int minh=Math.min(height[l],height[r]);
            int width=r-l;
            maxA=Math.max(maxA,minh*width);
            while(l<r && height[l]<=minh) l++;
            while(l<r && height[r]<=minh) r--; 
        }
        return maxA;
    }
}