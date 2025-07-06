import java.util.Scanner;

public class BinarySearch {
  public static int RecursiveSearch(int a[], int low, int high, int temp) {
    if (high>= low) {
      int mid = low +(high- low) / 2;
      if (a[mid] == temp)
        return mid;
      if (a[mid] > temp)
        return RecursiveSearch(a, low, mid + 1, temp);
      if (a[mid] < temp)
        return RecursiveSearch(a, mid + 1, high, temp);
    }
    return -1;

  }

  public static void main(String args[]) {
    int[] a = new int[10];
    Scanner s = new Scanner(System.in);
    int i, j, n;
    System.out.println("enter array elements");
    for (i = 0; i < a.length; i++) {
      a[i] = s.nextInt();
    }
    System.out.println("enter number to search");
    n = s.nextInt();
    int last = a.length;
    int result = RecursiveSearch(a, 0, last, n);
    if (result == -1)
      System.out.println("element is not found");
    else
      System.out.println("element is found at" + result);

  }

}
