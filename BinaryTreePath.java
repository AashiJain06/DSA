class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
         getPath(root,"");
         return ans;
    }
    public void getPath(TreeNode root, String currPath)
    {
        if(root==null)
         return;
         currPath+=root.val;
        if(root.left==null && root.right==null)
        {
            ans.add(currPath);
            return;
        }
        currPath+="->";
        getPath(root.left,currPath);
        getPath(root.right,currPath);
    }
}
