import java.util.Scanner;

public class InsertionSort {
  public static void main(String args[]) {
    int[] a = new int[5];
    Scanner s = new Scanner(System.in);
    int i, key, j;
    int n = a.length;
    System.out.println(n);
    System.out.println("enter array elements");
    for (i = 0; i < a.length; i++) {
      a[i] = s.nextInt();
    }
    System.out.println("array after sorting are");
    for (i = 1; i < n; i++) {
      key = a[i];
      j = i - 1;
      while (j > -1 && a[j] > key) {
        a[j + 1] = a[j];
        j--;

      }
      a[j + 1] = key;
    }
    for (i = 0; i < n; i++) {
      System.out.println(a[i]);
    }

  }

}
