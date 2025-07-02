import java.util.Scanner;

public class SubstringQuestion1 {
  public static int substrCount(String s, int k) {
    // int sode here
    int n = s.length();
    if (k > n)
      return 0;
    int[] freq = new int[26];
    int ans = 0;
    int dis = 0;
    for (int i = 0; i < k - 1; i++) {
      freq[s.charAt(i) - 'a']++;
      if (freq[s.charAt(i) - 'a'] == 1)
        dis++;
    }
    for (int i = k - 1; i < n; i++) {
      freq[s.charAt(i) - 'a']++;
      if (freq[s.charAt(i) - 'a'] == 1)
        dis++;
      if (dis == k - 1)
        ans++;
      freq[s.charAt(i - k + 1) - 'a']--;
      if (freq[s.charAt(i - k + 1) - 'a'] == 0)
        dis--;
    }
    return ans;
  }

  public static void main(String[] args) {
    String s;
    Scanner sc = new Scanner(System.in);
    s = sc.next();
    int k = sc.nextInt();
    int ans = substrCount(s, k);
    System.out.println(ans);
  }

}
