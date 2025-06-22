import java.util.Scanner;

public class KadansAlgorithm {
  public static int maxSubarraySum(int[] arr) {
    int n = arr.length;
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum = sum + arr[i];
      if (sum > max) {
        max = sum;
      }
      if (sum < 0) {
        sum = 0;
      }
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
    int max = maxSubarraySum(arr);
    System.out.println(max);

  }
}
