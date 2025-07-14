import java.util.Arrays;

public class StringQuestion5 {
  public int cuts(String s) {
    int n = s.length();
    int[] dp = new int[n];
    Arrays.fill(dp, -1);
    int res = helper(s, 0, dp);
    return res == Integer.MAX_VALUE ? -1 : res;

  }

  public static int helper(String s, int index, int[] dp) {
    if (index == s.length())
      return 0;
    if (dp[index] != -1)
      return dp[index];
    if (s.charAt(index) == '0')
      return Integer.MAX_VALUE;
    int minCuts = Integer.MAX_VALUE;
    for (int end = index + 1; end <= s.length(); end++) {
      String sub = s.substring(index, end);
      if (isPowerOfFive(sub)) {
        int next = helper(s, end, dp);
        if (next != Integer.MAX_VALUE) {
          minCuts = Math.min(minCuts, 1 + next);
        }
      }
    }
    return dp[index] = minCuts;
  }

  public static boolean isPowerOfFive(String binary) {
    long val = Long.parseLong(binary, 2);
    if (val == 0)
      return false;
    while (val % 5 == 0)
      val /= 5;
    return val == 1;
  }

}
