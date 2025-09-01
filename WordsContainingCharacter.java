package String;

import java.util.ArrayList;
import java.util.List;

public class WordsContainingCharacter {
  // You are given a 0-indexed array of strings words and a character x.
  // Return an array of indices representing the words that contain the character
  // x.
  // Note that the returned array may be in any order.

  // Example 1:
  // Input: words = ["leet","code"], x = "e"
  // Output: [0,1]
  // Explanation: "e" occurs in both words: "leet", and "code". Hence, we return
  // indices 0 and 1.

  public List<Integer> findWordsContaining(String[] words, char x) {
    int n = words.length;
    List<Integer> ans = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      String ch = words[i];
      if (ch.indexOf(x) != -1)
        ans.add(i);
    }
    return ans;
  }
}
