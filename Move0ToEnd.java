import java.util.Scanner;

public class Move0ToEnd {
  public static void move(int[] a, int n) {
    int[] temp = new int[n];
    int j = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] != 0) {
        temp[j] = a[i];
        j++;
      }
    }
    for (int i = 0; i < n; i++) {
      a[i] = temp[i];
    }
    for (int i = temp.length; i < n; i++) {
      a[i] = 0;
    }
    System.out.println("array after moving 0 to end is:");
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[5];
    int n = arr.length;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    move(arr, n);

  }
}
