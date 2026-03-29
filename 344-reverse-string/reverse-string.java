class Solution {
    public void reverseString(char[] s) {
        int len=s.length;
        int begin=0;
        for(int i=0;i<s.length/2;i++)
        {
            char temp=s[i];
           s[i]=s[len-1-i];
           s[len-1-i]=temp;
           
        }
    }
}