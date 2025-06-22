import java.util.Scanner;

public class MaximumProductSubarray {
  public static int maxProduct(int[] arr) {
    int n = arr.length;
    int max = Integer.MIN_VALUE;
    int pre = 1;
    int suff = 1;
    for (int i = 0; i < n; i++) {
      if (pre == 0)
        pre = 1;
      if (suff == 0)
        suff = 1;
      pre = pre * arr[i];
      suff = suff * arr[n - i - 1];
      max = Math.max(max, Math.max(suff, pre));
    }
    return max;
  }

  public static void main(String[] args) {
    int[] arr = new int[5];
    int n = arr.length;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int max = maxProduct(arr);
    System.out.println("max :" + max);

  }
}
