public class NumberOfZeroFillledSubArray {
  // Example 1:
  // Input: nums = [1,3,0,0,2,0,0,4]
  // Output: 6
  // Explanation:
  // There are 4 occurrences of [0] as a subarray.
  // There are 2 occurrences of [0,0] as a subarray.
  // There is no occurrence of a subarray with a size more than 2 filled with 0.
  // Therefore, we return 6.
  // Example 2:

  // Input: nums = [0,0,0,2,0,0]
  // Output: 9
  // Explanation:
  // There are 5 occurrences of [0] as a subarray.
  // There are 3 occurrences of [0,0] as a subarray.
  // There is 1 occurrence of [0,0,0] as a subarray.
  // There is no occurrence of a subarray with a size more than 3 filled with 0.
  // Therefore, we return 9.
  public long zeroFilledSubarray(int[] nums) {
    long count = 0;
    long total = 0;
    long prev = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0 && prev != 0) {
        count = 1;
        total += count;
        prev = nums[i];
      } else if (nums[i] == 0 && prev == 0) {
        count++;
        total += count;
        prev = nums[i];
      } else {
        count = 0;
        prev = nums[i];
      }
    }
    return total;
  }
}
