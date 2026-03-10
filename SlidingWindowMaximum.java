class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i =0;
        int j =0;
        int n = nums.length;
        int[] ans = new int[n-k+1];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int ptr = 0;
        while(j<n)
        {
            while(!q.isEmpty() && q.peekLast()<nums[j])
            {
             q.pollLast();
            }
            q.add(nums[j]);
            if((j-i+1)<k)
             j++;
            else if(j-i+1==k)
            {
               ans[ptr++] = q.peek();
               if(nums[i]==q.peek())
                q.pollFirst();
                  i++;
            j++;
            }
        }
        return ans;
    }
}
