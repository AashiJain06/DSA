import java.util.Arrays;
import java.util.Scanner;

public class MinimiseTheHeight {
  public static int getMinDiff(int[] arr, int k) {
    // code here
    int n = arr.length;
    Arrays.sort(arr);
    int res = arr[n - 1] - arr[0];
    int min, max;
    for (int i = 1; i < n; i++) {
      if (arr[i] - k < 0)
        continue;
      min = Math.min(arr[0] + k, arr[i] - k);
      max = Math.max(arr[i - 1] + k, arr[n - 1] - k);

      res = Math.min(res, max - min);
    }
    return res;
  }

  public static void main(String[] args) {
    int[] arr = new int[5];
    int n = arr.length;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int x = getMinDiff(arr, 4);
    System.out.println(x);
  }
}
