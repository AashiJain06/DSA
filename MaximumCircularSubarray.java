import java.util.Scanner;

public class MaximumCircularSubarray {
  public static int circularSubarraySum(int arr[]) {
    // code here
    int n = arr.length;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int sum1 = 0, sum2 = 0;
    int total = 0;
    for (int i = 0; i < n; i++) {
      total = total + arr[i];
      sum1 = sum1 + arr[i];
      sum2 = sum2 + arr[i];
      if (sum1 < 0)
        sum1 = 0;
      if (sum2 > 0)
        sum2 = 0;
      max = Math.max(sum1, max);
      min = Math.min(sum2, min);
    }
    return Math.max(max, total - min);
  }

  public static void main(String[] args) {
    int[] arr = new int[5];
    int n = arr.length;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int max = circularSubarraySum(arr);
    System.out.println("max :" + max);

  }
}
