package String;

public class FirstPalindromeStringInTheArray {
  // Given an array of strings words, return the first palindromic string in the
  // array. If there is no such string, return an empty string "".

  // A string is palindromic if it reads the same forward and backward.
  // Example 1:
  // Input: words = ["abc","car","ada","racecar","cool"]
  // Output: "ada"
  // Explanation: The first string that is palindromic is "ada".
  // Note that "racecar" is also palindromic, but it is not the first.
  public String firstPalindrome(String[] words) {
    int n = words.length;
    for (int i = 0; i < n; i++) {
      String s = words[i];
      int k = 0;
      int j = s.length() - 1;
      boolean status = true;
      while (k <= j) {
        if (s.charAt(k) == s.charAt(j)) {
          k++;
          j--;
        } else {
          status = false;
          break;

        }
      }
      if (status == true) {
        return words[i];
      }
    }
    return "";
  }
}
