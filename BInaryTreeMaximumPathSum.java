class Solution {
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
         max[0] = Integer.MIN_VALUE;
        getMaxPathSum(root,max);
        return max[0];
    }
    public int getMaxPathSum(TreeNode root, int max[])
    {
        if(root==null)
         return 0;
        
        int leftSum = Math.max(0,getMaxPathSum(root.left,max));
        int rightSum = Math.max(0,getMaxPathSum(root.right,max));
        max[0] =Math.max(max[0],leftSum+rightSum+root.val);

        return root.val + Math.max(leftSum,rightSum);
    }
}
