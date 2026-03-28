class Solution {
    public int[] plusOne(int[] digits) {
       int add=1;
       for(int i=digits.length-1;i>=0;i--)
       {
        int value=digits[i];
        value+=add;
        if(value!=10)
        {
            digits[i]=value;
            return digits;
        }
        digits[i]=0;
       } 
       int []arr=new int[digits.length+1];
       arr[0]=1;
       return arr;
    }
}