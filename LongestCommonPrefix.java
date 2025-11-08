class Solution {
//   Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".
// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:
// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

    public String common(String s1, String s2)
    {
        int n = Math.min(s1.length(),s2.length());
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<n;i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
            sb.append(s1.charAt(i));
            else
            break;
        }
        return sb.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        for(int i =0;i<strs.length;i++)
        {
            res = common(res,strs[i]);
        }
        return res;
    }
}
