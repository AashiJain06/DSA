class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
         ArrayList<Integer> ans = new ArrayList<>();
        preorder(root,ans);
        return ans;
    }
    private void preorder(Node root,ArrayList<Integer> ans)
    {
        if(root==null)
         return;
        ans.add(root.data);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }
}
