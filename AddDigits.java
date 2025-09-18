public class AddDigits {
  // Example 1:

  // Input: num = 38
  // Output: 2
  // Explanation: The process is
  // 38 --> 3 + 8 --> 11
  // 11 --> 1 + 1 --> 2
  // Since 2 has only one digit, return it.
  // Brute Force Solution
  public int addDigits(int num) {
        while(num>=10) {
            int sum=0;
            while(num>0) {
                sum=sum+num%10;
                num/=10;
            }
            num=sum;
        }
        return num;
    }
  // Optimal Solution
  if(num==0)return 0;return(num-1)%9+1;
}
