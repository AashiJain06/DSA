import java.util.Arrays;
import java.util.Scanner;

public class SplitArrayLargestSum {
  public static boolean isPossible(int[] arr, int mid, int k) {
    int n = arr.length;
    int count = 0;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] > mid)
        return false;
      sum += arr[i];
      if (sum > mid) {
        count++;
        sum = arr[i];
      }
    }
    count++;
    return count <= k;
  }

  public static int splitArray(int[] arr, int k) {
    int n = arr.length;
    int max = Arrays.stream(arr).max().getAsInt();
    int start = max;
    int end = 0;
    for (int i = 0; i < n; i++) {
      end += arr[i];
    }
    int ans = 0;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (isPossible(arr, mid, k)) {
        ans = mid;
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr = new int[4];
    int n = arr.length;
    int k;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter k");
    k = sc.nextInt();
    int ans = splitArray(arr, k);
    System.out.println(ans);
  }
}