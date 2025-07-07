import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ArrayQuestion1 {
  public static ArrayList<Integer> nextLargerElement(int[] arr) {
    int n = arr.length;
    int[] res = new int[n];
    Stack st = new Stack();
    Arrays.fill(res, -1);
    for (int i = 0; i < 2 * n; i++) {
      int idx = i % n;
      int num = arr[idx];
      while (!st.isEmpty() && num > arr[(int) st.peek()]) {
        res[(int) st.peek()] = num;
        st.pop();
      }
      if (i < n) {
        st.push(idx);
      }
    }
    ArrayList<Integer> result = new ArrayList<>();
    for (int a : res) {
      result.add(a);
    }
    return result;
  }

  public static void main(String[] args) {
    ArrayList result = new ArrayList<>();
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    result = nextLargerElement(arr);
    System.out.println(result);
  }
}