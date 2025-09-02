public class MinimumNumberGame {
  public int[] numberGame(int[] nums) {
    int n = nums.length;
    int arr[] = new int[n];
    Arrays.sort(nums);
    int bob = 0;
    int alice = 1;
    for (int i = 1; i < n; i = i + 2) {
      arr[bob] = nums[i];
      bob += 2;
    }
    for (int i = 0; i < n; i = i + 2) {
      arr[alice] = nums[i];
      alice += 2;
    }
    return arr;
  }
}
