import java.util.Scanner;

public class Move0ToEnd2 {
  public static void move(int[] a, int n) {
    int j = -1;
    for (int i = 0; i < n; i++) {
      if (a[i] == 0) {
        j = i;
        break;
      }
    }
    for (int i = j + 1; i < n; i++) {
      if (a[i] != 0) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        j++;
      }
    }
    System.out.println("array after moving 0 to end is:");
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }

  }

  public static void main(String[] args) {
    int[] arr = new int[10];
    int n = arr.length;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    move(arr, n);

  }
}