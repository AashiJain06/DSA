import java.util.Scanner;

public class SortArrayOf012 {
  public static void sort012(int[] arr) {
    int n = arr.length;
    int low = 0, mid = 0, high = n - 1;
    while (mid <= high) {
      if (arr[mid] == 0) {
        swap(arr, mid, low);
        low++;
        mid++;
      } else if (arr[mid] == 1) {
        mid++;
      } else {
        swap(arr, mid, high);
        high--;
      }
    }
    System.out.println("Array after sorting is:");
    for (int i = 0; i < n; i++) {
      System.out.println(" " + arr[i]);
    }
  }

  public static void swap(int[] a, int m, int n) {
    int temp = a[m];
    a[m] = a[n];
    a[n] = temp;
  }

  public static void main(String[] args) {
    int[] arr = new int[5];
    int d, n;
    n = arr.length;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sort012(arr);

  }
}
