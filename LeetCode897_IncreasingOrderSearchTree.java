class Solution {
    ArrayList<Integer> ans = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)
         return null;
        inorder(root);
        TreeNode root1 = new TreeNode(ans.get(0));
        TreeNode node = root1;
        for(int i =1;i<ans.size();i++)
        {
           node.right = new TreeNode(ans.get(i));
           node = node.right;
        }
        return root1;
    }
    public void inorder(TreeNode root)
    {
        if(root==null)
         return;
        inorder(root.left);
         ans.add(root.val);
        inorder(root.right);
    }
}
