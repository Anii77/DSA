class Solution {
    public boolean isPalindrome(int x) {
    //     Stack<Character> st=new Stack<Character>();
    //     String ans1=String.valueOf(x);
    //     int i=0;
    //   while(i!=ans1.length())
    //   {
    //     if(Character.isDigit(ans1.charAt(i)))
    //     st.push(ans1.charAt(i));

    //     i++;
    //   }
    //   String ans2="";
    //   while(st.size()!=0)
    //   {
    //      ans2+=st.pop();
    //   }
    //   if(ans2.equals(ans1))
    //     return true;

    //     return false;


    if(x<0)
    return false;

    String a=String.valueOf(x);
    for(int i=0;i<a.length();i++)
    {
        if(a.charAt(i)!=a.charAt(a.length()-1-i))
return false;
    }
    return true;
    }
}