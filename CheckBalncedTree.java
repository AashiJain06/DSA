// Given the root of a binary tree, determine if it is height-balanced or not.
// Note: A binary tree is considered height-balanced if the absolute difference in heights of the left and right subtrees is at most 1 for every node in the tree.
// Examples:
// Input: root = [10, 20, 30, 40, 60]   
// Output: true 
// Explanation: The height difference between the left and right subtrees at all nodes is at most 1. Hence, the tree is balanced
class Solution {
    public boolean isBalanced(Node root) {
       return dfsHeight(root)!=-1;
        
    }
     int dfsHeight(Node root)
{
    if(root==null)
     return 0;

     int lh = dfsHeight(root.left);
     if(lh==-1) 
      return -1;
    int rh = dfsHeight(root.right);
    if(rh==-1)
     return -1;
    
    if(Math.abs(lh-rh)>1)
     return -1;
    
    return Math.max(lh , rh)+1;
}
}
