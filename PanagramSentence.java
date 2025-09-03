package String;

import java.util.Arrays;

public class PanagramSentence {
  // A pangram is a sentence where every letter of the English alphabet appears at
  // least once.

  // Given a string sentence containing only lowercase English letters, return
  // true if sentence is a pangram, or false otherwise.
  // Example 1:

  // Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
  // Output: true
  // Explanation: sentence contains at least one of every letter of the English
  // alphabet.
  public boolean checkIfPangram(String sentence) {
    int[] freq = new int[26];
    Arrays.fill(freq, 0);
    for (int i = 0; i < sentence.length(); i++) {
      freq[sentence.charAt(i) - 'a']++;
    }
    for (int i = 0; i < freq.length; i++) {
      if (freq[i] == 0)
        return false;
    }
    return true;
  }
}
