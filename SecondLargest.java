import java.util.Scanner;

public class SecondLargest {
  public static int secondLargestElement(int[] a) {
    int n = a.length;
    int slargest = -1;
    int largest = a[0];
    for (int i = 1; i < n; i++) {
      if (a[i] > largest) {
        slargest = largest;
        largest = a[i];
      } else if (a[i] > largest && a[i] > slargest) {
        slargest = a[i];
      }

    }
    if (largest == slargest)
      return -1;
    else
      return slargest;
  }

  public static void main(String[] args) {
    int[] arr = new int[5];
    int slargest;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    slargest = secondLargestElement(arr);
    System.out.println(slargest);

  }
}
