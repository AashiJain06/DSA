class Solution {
    public char repeatedCharacter(String s) {
         HashMap<Character,Integer> hs = new HashMap<>();
        for(char c : s.toCharArray())
        {
            hs.put(c,hs.getOrDefault(c,0)+1);
            if(hs.get(c)>=2)
             return c;
        }
      return ' ';
    }
    
}
