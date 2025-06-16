import java.util.Scanner;

public class NextPermutation {

  public static void nextPermutation(int[] a) {
    int n = a.length;
    int ind = -1;
    int i;
    for (i = n - 2; i >= 0; i--) {
      if (a[i] > a[i + 1]) {
        ind = i;
        break;
      }
    }
    if (ind == -1) {
      reverse(a, 0, n - 1);
      return;
    }
    for (i = n - 1; i > ind; i--) {
      if (a[i] > a[ind]) {
        swap(a, i, ind);
      }
    }
    reverse(a, ind + 1, n - 1);
    System.out.println("next permutation is:");
    for (int i = 0; i < n; i++) {
      System.out.print(" " + arr[i]);
  }

  public static void reverse(int[] arr, int start, int end) {
    while (start <= end) {
      swap(arr, start, end);
    }

  }

  public static void swap(int[] a, int m, int n) {
    int temp = a[n];
    a[n] = a[m];
    a[m] = temp;
  }

  public static void main(String[] args) {
    int[] arr = new int[5];
    int n = arr.length;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    nextPermutation(arr);
    }
  }
}
