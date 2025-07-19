
public class StringQuestion6 {
  public int vowelCount(String s) {
    int[] vowel = new int[5];
    for (char ch : s.toCharArray()) {
      if (ch == 'a')
        vowel[0]++;
      else if (ch == 'e')
        vowel[1]++;
      else if (ch == 'i')
        vowel[2]++;
      else if (ch == 'o')
        vowel[3]++;
      else if (ch == 'u')
        vowel[4]++;
    }
    int count = 0;
    int ways = 1;
    for (int n : vowel)
      if (n > 0) {
        count++;
        ways *= n;
      }
    if (count == 0)
      return 0;
    int fact = 1;
    for (int i = 2; i <= count; i++) {
      fact = fact * i;
    }
    return ways * fact;
  }

}