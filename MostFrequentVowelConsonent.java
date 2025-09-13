package String;

public class MostFrequentVowelConsonent {
  public int maxFreqSum(String s) {
    int[] freq = new int[26];
    for (char c : s.toCharArray()) {
      freq[c - 'a']++;
    }
    int vmax = 0;
    int cmax = 0;
    String vowels = "aeiou";
    for (int i = 0; i < 26; i++) {
      int f = freq[i];
      char c = (char) (i + 'a');
      if (vowels.indexOf(c) != -1) {
        vmax = Math.max(f, vmax);
      } else
        cmax = Math.max(f, cmax);
    }
    return (cmax + vmax);
  }
}
