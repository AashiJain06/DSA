public class StringQuestion8 {
  // Given a string s consisting of words and spaces, return the length of the
  // last word in the string.

  // A word is a maximal substring consisting of non-space characters only.

  // Example 1:

  // Input: s = "Hello World"
  // Output: 5
  // Explanation: The last word is "World" with length 5.

  public int lengthOfLastWord(String s) {
    int n = s.length() - 1;
    while (s.charAt(n) == ' ')
      n--;

    int count = 0;
    while (n >= 0 && s.charAt(n) != ' ') {
      count++;
      n--;
    }
    return count;
  }

}
