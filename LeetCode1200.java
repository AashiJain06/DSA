class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] nums) {
        Arrays.sort(nums);
        int min_diff = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =1;i<nums.length;i++)
        {
           min_diff = Math.min(nums[i]-nums[i-1],min_diff);
        }
        for(int i =1;i<nums.length;i++)
        {
            if((nums[i]-nums[i-1])==min_diff)
            {
                List subList = new ArrayList<>();
                subList.add(nums[i-1]);
                subList.add(nums[i]);
                ans.add(subList);
            }
        }
        return ans;
    }
}
