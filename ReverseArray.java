import java.util.Scanner;

public class ReverseArray {
  public void reverseArray(int arr[]) {
    // code here
    int n = arr.length;
    int start = 0, end = n - 1;
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    System.out.println("reverse of an array is:");
    for (int i = 0; i < n; i++) {
      System.out.println(" " + arr[i]);
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

  }
}
