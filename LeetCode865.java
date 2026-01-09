class Solution {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
      if(root==null)
       return null;
     int left = getDepth(root.left);
     int right = getDepth(root.right);
     if(left==right)
      return root;
     else
     {
        if(left>right)
         return subtreeWithAllDeepest(root.left);
         else
         return subtreeWithAllDeepest(root.right);
     } 
 
    }
    public int getDepth(TreeNode root)
    {
        if(root==null)
         return 0;
        return 1 + Math.max(getDepth(root.left),getDepth(root.right));
    }
}
