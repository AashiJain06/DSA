class Solution {
    //Using Sliding Window 
    // public int longestSubarray(int[] nums) {
    //     int count =0;
    //     int max_length =0;
    //     int i =0;
    //     int j =0;
    //     while(j<nums.length)
    //     {
    //         if(nums[j]==0)
    //          count++;
    //         while(count>1)
    //         {
    //             if(nums[i]==0)
    //              count--;

    //             i++;
    //         }
    //         max_length = Math.max(j-i,max_length);
    //     }
    //    return max_length;
    // }

    //Using Sliding Window and eliminating inner while loop
     public int longestSubarray(int[] nums)
     {
        int max_length =0;
        int i =0;
        int j =0;
        int zero_index =-1;
        while(j<nums.length)
        {
            if(nums[j]==0)
            {
               i = zero_index+1;
               zero_index = j;
            }
            max_length = Math.max(max_length,j-i);
            j++;
        }
        return max_length;
     }
}
