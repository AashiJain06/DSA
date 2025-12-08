class Solution {
    int leftSum =0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root);
        return leftSum;
    }
    public void helper(TreeNode root)
    {
        if(root==null)
         return;
         if(isLeafNode(root.left))
          leftSum+=root.left.val;
        helper(root.left);
        helper(root.right);
    }
    private boolean isLeafNode(TreeNode node)
    {
        if(node==null)
         return false;
        if(node.left==null && node.right==null)
         return true;
        return false;
    }
}
