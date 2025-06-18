import java.util.Scanner;

public class LinearSearch {
  public static int search(int arr[], int k) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] == k)
        return i;
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = new int[5];
    int x;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    x = search(arr, 4);
    System.out.println(x);

  }
}
