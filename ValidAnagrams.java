class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> count= new HashMap<>();
        for(char ch : s.toCharArray())
        {
           count.put(ch,count.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray())
        {
            if(count.containsKey(ch))
            {
             count.put(ch,count.getOrDefault(ch,0)-1);
             if(count.get(ch)==0)
              count.remove(ch);
            }
            else
             return false;
        }
        return count.size()==0 ? true : false;
    }
}
