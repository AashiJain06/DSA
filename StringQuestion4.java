import java.util.HashMap;
import java.util.Scanner;

public class StringQuestion4 {
  public static int countAtMostK(int arr[], int k) {
    // code here
    int n = arr.length;
    int i = 0;
    int j = 0;
    int result = 0;
    HashMap<Integer, Integer> hs = new HashMap<>();
    while (j < n) {
      hs.put(arr[j], hs.getOrDefault(arr[j], 0) + 1);
      while (hs.size() > k) {
        hs.put(arr[i], hs.get(arr[i]) - 1);
        if (hs.get(arr[i]) == 0)
          hs.remove(arr[i]);
        i++;
      }
      result += j - i + 1;
      j++;
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = new int[5];
    int n = arr.length;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    int ans = countAtMostK(arr, k);
    System.out.println(ans);

  }
}
