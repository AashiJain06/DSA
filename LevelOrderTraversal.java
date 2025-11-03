class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)
         return ans;
        qu.offer(root);
        while(!qu.isEmpty())
        {
            int levelNum = qu.size();
            List<Integer> subList = new ArrayList<>();
            for(int i=0;i<levelNum;i++)
            {
                if(qu.peek().left!=null)
                 qu.offer(qu.peek().left);
                if(qu.peek().right!=null)
                 qu.offer(qu.peek().right);
                subList.add(qu.poll().val);
            }
            ans.add(subList);
        }
        return ans;
    }
}
