class Solution {
    static int maxD =0;
    public int diameter(Node root) {
        // code here
        
    maxD =0;
        computeHeight(root);
        return maxD;
    }
    public int computeHeight(Node node)
    {
        if(node==null)
         return 0;
      int  lh = computeHeight(node.left);
       int rh = computeHeight(node.right);
         maxD = Math.max(maxD,lh + rh);
        return Math.max(rh,lh)+1;
    }
}
