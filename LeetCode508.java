class Solution {
    Map<Integer,Integer> count = new HashMap<>();
    int maxCount =0;
    public int[] findFrequentTreeSum(TreeNode root) {
       subTreeSum(root);
       List<Integer> ans = new ArrayList<>();
       for(int s : count.keySet())
       {
         if(count.get(s)==maxCount)
          ans.add(s);
       }
       return ans.stream().mapToInt(i->i).toArray(); 
    }
    public int subTreeSum(TreeNode root)
    {
        if(root==null)
         return 0;
        int sum = subTreeSum(root.left) + subTreeSum(root.right)+ root.val;
        count.put(sum,count.getOrDefault(sum,0)+1);
        maxCount = Math.max(maxCount,count.get(sum));
        return sum;
    }
}
