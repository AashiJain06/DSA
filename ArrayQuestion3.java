import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ArrayQuestion3 {
  public static int sumSubMins(int[] arr) {
    // code here
    int n = arr.length;
    int[] left = new int[n];
    int[] right = new int[n];
    Stack<int[]> s1 = new Stack<>();
    Stack<int[]> s2 = new Stack<>();
    for (int i = 0; i < n; i++) {
      int count = 1;
      while (!s1.isEmpty() && s1.peek()[0] > arr[i]) {
        count += s1.pop()[1];
      }
      s1.push(new int[] { arr[i], count });
      left[i] = count;
    }
    for (int i = n - 1; i >= 0; i--) {
      int count = 1;
      while (!s2.isEmpty() && s2.peek()[0] >= arr[i]) {
        count += s2.pop()[1];
      }
      s2.push(new int[] { arr[i], count });
      right[i] = count;
    }
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i] * left[i] * right[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int result = sumSubMins(arr);
    System.out.println(result);

  }

}
