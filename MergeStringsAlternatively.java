package String;

public class MergeStringsAlternatively {
  // Example 1:
  // Input: word1 = "abc", word2 = "pqr"
  // Output: "apbqcr"
  // Explanation: The merged string will be merged as so:
  // word1: a b c
  // word2: p q r
  // merged: a p b q c r

  // Example 2:
  // Input: word1 = "ab", word2 = "pqrs"
  // Output: "apbqrs"
  // Explanation: Notice that as word2 is longer, "rs" is appended to the end.
  // word1: a b
  // word2: p q r s
  // merged: a p b q r s
  public String mergeAlternately(String word1, String word2) {
    int n1 = word1.length();
    int n2 = word2.length();
    StringBuilder ans = new StringBuilder();
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < n1 && j < n2) {
      if (k % 2 == 0) {
        ans.append(word1.charAt(i));
        i++;
      } else {
        ans.append(word2.charAt(j));
        j++;
      }
      k++;
    }
    while (i < n1) {
      ans.append(word1.charAt(i));
      i++;
    }
    while (j < n2) {
      ans.append(word2.charAt(j));
      j++;
    }
    return ans.toString();
  }
}
