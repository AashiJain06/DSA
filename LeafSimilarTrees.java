class Solution {
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null || root2==null)
         return false;
        leafSimilarHelp(root1,list1);
        leafSimilarHelp(root2,list2);
        return list1.equals(list2);
    }
    public void leafSimilarHelp(TreeNode root,ArrayList<Integer> list)
    {
        if(root==null)
         return;
        if(root.left==null && root.right==null)
         list.add(root.val);
        leafSimilarHelp(root.left,list);
        leafSimilarHelp(root.right,list);
    }
}
