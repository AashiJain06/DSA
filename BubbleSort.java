import java.util.*;

public class BubbleSort {
  public static void main(String args[]) {
    int[] a = new int[10];
    Scanner sc= new Scanner(System.in);
    int i, j, temp;
    int n = a.length;
    System.out.println("enter array elements");
    for (i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("elements in the ascending order are");
    for (i = 0; i < n - 1; i++) {
      for (j = 0; j < n - i - 1; j++) {
        if (a[j] > a[j + 1]) {

          temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      }
    }

    for (i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }

}
