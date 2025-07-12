import java.util.Arrays;
import java.util.Scanner;

public class GoldMineProblem {
  public static int collect(int i, int j, int[][] mat, int[][] dp) {
    int n = mat.length;
    int m = mat[0].length;
    if (i < 0 || i >= n || j >= m)
      return 0;
    if (dp[i][j] != -1)
      return dp[i][j];
    int rightUp = collect(i - 1, j + 1, mat, dp);
    int right = collect(i, j + 1, mat, dp);
    int rightDown = collect(i + 1, j + 1, mat, dp);
    return dp[i][j] = mat[i][j] + Math.max(Math.max(rightUp, right), rightDown);
  }

  public static int maxGold(int[][] mat) {
    int n = mat.length;
    int m = mat[0].length;
    int result = 0;
    int[][] dp = new int[n][m];
    for (int[] row : dp) {
      Arrays.fill(row, -1);
    }
    for (int i = 0; i < n; i++) {
      int gold = collect(i, 0, mat, dp);
      result = Math.max(result, gold);
    }
    return result;
  }

  public static void main(String[] args) {
    int[][] arr = new int[3][3];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array Elements");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    int result = maxGold(arr);
    System.out.println(result);

  }
}
