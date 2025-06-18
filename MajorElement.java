import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MajorElement {
  public static List<Integer> findMajority(int[] nums) {
    int el1 = -1, el2 = -1, i;
    int cnt1 = 0, cnt2 = 0;
    int n = nums.length;
    for (i = 0; i < n; i++) {
      if (nums[i] == el1)
        cnt1++;
      else if (nums[i] == el2)
        cnt2++;
      else if (cnt1 == 0) {
        el1 = nums[i];
        cnt1++;
      } else if (cnt2 == 0) {
        el2 = nums[i];
        cnt2++;
      } else {
        cnt1--;
        cnt2--;
      }
    }
    int cnt3 = 0, cnt4 = 0;
    List<Integer> rs = new ArrayList<>();
    for (i = 0; i < n; i++) {
      if (el1 == nums[i])
        cnt3++;
      if (el2 == nums[i])
        cnt4++;
    }
    if (cnt3 > n / 3)
      rs.add(el1);
    if (cnt4 > n / 3 && el1 != el2)
      rs.add(el2);

    if (rs.size() == 2 && (int) rs.get(0) > (int) rs.get(1)) {
      int temp = (int) rs.get(0);
      rs.set(0, rs.get(1));
      rs.set(1, temp);
    }

    return rs;
  }

  public static void main(String[] args) {
    int[] arr = new int[5];
    int n = arr.length;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    List al = new ArrayList<>();
    al = findMajority(arr);
  }
}
