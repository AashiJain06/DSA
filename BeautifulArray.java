public class BeautifulArray {
  public static int balanceSums(int[][] mat) {
    int n = mat.length;
    int maxSum = 0;
    int operation = 0;
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = 0; j < n; j++) {
        sum += mat[i][j];
      }
      maxSum = Math.max(maxSum, sum);
    }
    for (int j = 0; j < n; j++) {
      int sum = 0;
      for (int i = 0; i < n; i++) {
        sum += mat[i][j];
      }
      maxSum = Math.max(sum, maxSum);
    }
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = 0; j < n; j++) {
        sum += mat[i][j];
      }
      operation += maxSum - sum;
    }
    return operation;
  }

}
