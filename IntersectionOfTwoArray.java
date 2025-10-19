class Solution {
//   Given two integer arrays nums1 and nums2, return an array of their intersection.
//   Each element in the result must be unique and you may return the result in any order.
// Example 1:
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:
// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.
    public int[] intersection(int[] nums1, int[] nums2) {
       boolean[] seen = new boolean[1001];
       ArrayList<Integer> ans = new ArrayList<>();
       for(int i =0;i<nums1.length;i++)
       {
         seen[nums1[i]]=true;
       } 
       for(int i =0;i<nums2.length;i++)
       {
        if(seen[nums2[i]])
        {
          ans.add(nums2[i]);
          seen[nums2[i]]=false;
        }
       }
        return ans.stream()
                              .mapToInt(Integer::intValue)
                              .toArray();
    }
}
