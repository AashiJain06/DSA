class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int min_length = Integer.MAX_VALUE;
        int sum =0;
        int j =0;
        int i =0;
        while(j<n)
        {
            sum+=nums[j];
            while(sum>=target)
            {
                min_length = Math.min(min_length,j-i+1);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return (min_length==Integer.MAX_VALUE) ? 0 : min_length;
    }
}
