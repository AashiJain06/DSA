import java.util.HashMap;
import java.util.Scanner;

public class StringQuestion3 {
  public static int longestKSubstr(String s, int k) {
    // code here
    HashMap<Character, Integer> hs = new HashMap<>();
    int n = s.length();
    int j = 0;
    int i = 0;
    int result = -1;
    while (j < n) {
      hs.put(s.charAt(j), hs.getOrDefault(s.charAt(j), 0) + 1);
      if (hs.size() > k) {
        hs.put(s.charAt(i), hs.get(s.charAt(i)) - 1);
        if (hs.get(s.charAt(i)) == 0)
          hs.remove(s.charAt(i));
        i++;
      }
      if (hs.size() == k) {
        result = Math.max(result, j - i + 1);
      }
      j++;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s;
    s = sc.next();
    System.out.println("Enter k");
    int k = sc.nextInt();
    int result = longestKSubstr(s, k);
    System.out.println(result);
  }
}
