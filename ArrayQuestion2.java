import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ArrayQuestion2 {
  public static ArrayList<Integer> findGreater(int[] arr) {
    int n = arr.length;
    HashMap<Integer, Integer> hs = new HashMap<>();
    int[] rs = new int[n];
    Stack st = new Stack();
    Arrays.fill(rs, -1);
    for (int i = 0; i < n; i++) {
      hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
    }
    for (int i = 0; i < n; i++) {
      while (!st.isEmpty() && hs.get(arr[i]) > hs.get(arr[(int) st.peek()])) {
        rs[(int) st.pop()] = arr[i];
      }
      st.push(i);
    }
    ArrayList al = new ArrayList<>();
    for (int val : rs) {
      al.add(val);
    }
    return al;
  }

  public static void main(String[] args) {
    int[] arr = new int[5];
    ArrayList al = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    al = findGreater(arr);
    System.out.println(al);
  }

}
