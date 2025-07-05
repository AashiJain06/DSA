import java.util.Scanner;

public class SubArrayQuestion1 {
  public static int maxSum(int arr[]) {
    // code here
    int n = arr.length;
    int result = arr[0] + arr[1];
    for (int i = 1; i < n - 1; i++) {
      result = Math.max(result, arr[i] + arr[i + 1]);
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = new int[5];
    int n = arr.length;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int result = maxSum(arr);
    System.out.println(result);
  }
}
