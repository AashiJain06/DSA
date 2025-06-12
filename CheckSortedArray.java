import java.util.Scanner;

public class CheckSortedArray {
  public static int check(int[] a) {
    for (int i = 1; i < (a.length - 1); i++) {
      if (a[i] < a[i + 1])
        continue;
      else
        return -1;
    }
    return 0;
  }

  public static void main(String[] args) {
    int[] arr = new int[5];
    int x;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    x = check(arr);
    if (x == 0)
      System.out.println("array is sorted in ascending");
    else
      System.out.println("array is not sorted in ascending");
  }
}
