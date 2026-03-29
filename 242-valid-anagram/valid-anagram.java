class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(char c:s.toCharArray())
        hmap.put(c,hmap.getOrDefault(c,0)+1);

        for(char c:t.toCharArray())
        {
            if(!hmap.containsKey(c))
            {
                return false;
            }
            hmap.put(c,hmap.get(c)-1);
            if(hmap.get(c)==0)
            hmap.remove(c);
        }
        return hmap.isEmpty();
    }
}