class Solution {
//   Given a string s, reverse the string without reversing its individual words. Words are separated by dots(.).

// Note: The string may contain leading or trailing dots(.) or multiple dots(.) between two words. 
  // The returned string should only have a single dot(.) separating the words, and no extra dots should be included.

// Examples :

// Input: s = "i.like.this.program.very.much"
// Output: "much.very.program.this.like.i"
// Explanation: The words in the input string are reversed while maintaining the dots as separators, resulting in "much.very.program.this.like.i".
    public String reverseWords(String s) {
     ArrayList<String> words = new ArrayList<>();
        String[] parts = s.split("\\.");
        
        for (String word : parts) {
            if (!word.isEmpty()) {
                words.add(word);
            }
        }
        
      
        Collections.reverse(words);
        
       
        return String.join(".", words); 
    }
}
