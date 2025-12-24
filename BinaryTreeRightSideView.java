class Solution {
    public List<Integer> rightSideView(TreeNode root) {
      List<Integer> ans = new ArrayList<>();
      if(root==null)
       return ans;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty())
    {
        int queueSize = queue.size();
        int lastValue = 0;
        for(int i =0;i<queueSize;i++)
        {
           TreeNode node = queue.poll();
           lastValue = node.val;
        if(node.left!=null)
         queue.offer(node.left);
        if(node.right!=null)
         queue.offer(node.right);
        }  
        ans.add(lastValue);
    }
    return ans;
    }
}
