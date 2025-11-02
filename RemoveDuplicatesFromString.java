class Solution {
//   Given a string s without spaces, the task is to remove all duplicate characters from it, keeping only the first occurrence.
// Note: The original order of characters must be kept the same. 
// Examples :
// Input: s = "zvvo"
// Output: "zvo"
// Explanation: Only keep the first occurrence
// Input: s = "gfg"
// Output: "gf"
// Explanation: Only keep the first occurrence
    String removeDups(String s) {
        HashSet<Character> exists = new HashSet<>();
        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {
            
         
            if (!exists.contains(c)) {
                ans.append(c);
                exists.add(c);
            }
        }
        
        return ans.toString();
        
    }
}
