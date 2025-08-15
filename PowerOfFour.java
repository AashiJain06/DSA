public class PowerOfFour {
  // Example 1:

  // Input: n = 16
  // Output: true
  // Example 2:

  // Input: n = 5
  // Output: false
  // Example 3:

  // Input: n = 1
  // Output: true

  public boolean isPowerOfFour(int n) {
    if (n <= 0)
      return false;
    if (n == 1)
      return true;
    while (n % 4 == 0) {
      n = n / 4;
    }
    if (n == 1)
      return true;

    return false;
  }
}
