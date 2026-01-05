class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
      
        List<Double> ans = new ArrayList<>();
        if(root==null)
         return ans;
         Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty())
        {
            int n = qu.size();
            double sum =0;
            for(int i =0;i<n;i++)
            {
                TreeNode node = qu.poll();
                sum+=node.val;
                if(node.left!=null)
                 qu.offer(node.left);
                if(node.right!=null)
                 qu.offer(node.right);
            }
            ans.add(sum/n);
        }
      return ans;  
    }
}
