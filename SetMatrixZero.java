public class SetMatrixZero {
  public void setZeroes(int[][] matrix) {
    int n = matrix.length;
    int m = matrix[0].length;
    int col1 = matrix[0][0];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0;
          if (j != 0)
            matrix[0][j] = 0;
          else
            col1 = 0;
        }
      }
    }
    for (int i = 1; i < n; i++) {
      for (int j = 1; j < m; j++) {
        if (matrix[0][j] == 0 || matrix[i][0] == 0)
          matrix[i][j] = 0;
      }
    }
    if (matrix[0][0] == 0) {
      for (int j = 0; j < m; j++)
        matrix[0][j] = 0;
    }
    if (col1 == 0) {
      for (int i = 0; i < n; i++)
        matrix[i][0] = 0;
    }
  }
}
