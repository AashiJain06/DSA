import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayLeaders {
  public static ArrayList<Integer> leaders(int arr[]) {
    // code here
    int n = arr.length;
    int maxi = Integer.MIN_VALUE;
    ArrayList al = new ArrayList<>();
    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] >= maxi) {
        al.add(arr[i]);
        maxi = arr[i];
      }
    }
    Collections.reverse(al);
    return al;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    int n = arr.length;
    System.out.println("Enter Array Elements");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    ArrayList al = new ArrayList();
    al = leaders(arr);
    System.out.println(al);
  }
}
