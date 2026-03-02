class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int max_length = 0;
        int left =0;
        int n = s.length();
        for(int right =0;right<n;right++)
        {
            while(hs.contains(s.charAt(right)))
            {
                hs.remove(s.charAt(left));
                left++;
            }
            max_length = Math.max(max_length,right-left+1);
            hs.add(s.charAt(right));
        }
        return max_length;
    }
}
