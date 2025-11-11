class Solution {
// Given the root of a binary tree. You have to find the zig-zag level order traversal of the binary tree.
// Note: In zig zag traversal we traverse the nodes from left to right for odd-numbered levels, and from right to left for even-numbered levels.
// Examples:
// Input: root = [1, 2, 3, 4, 5, 6, 7]          
// Output: [1, 3, 2, 4, 5, 6, 7]
// Explanation:
// Level 1 (left to right): [1]
// Level 2 (right to left): [3, 2]
// Level 3 (left to right): [4, 5, 6, 7]
// Final result: [1, 3, 2, 4, 5, 6, 7]
    ArrayList<Integer> zigZagTraversal(Node root) {
       Queue<Node> q = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        boolean flag = false;
        if(root==null)
         return ans;
        q.offer(root);
        while(!q.isEmpty())
        {
            int qsize = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i =0;i<qsize;i++)
            {
               if(q.peek().left!=null)
                q.offer(q.peek().left);
               if(q.peek().right!=null)
               q.offer(q.peek().right);
               temp.add(q.poll().data);
            }
            flag = !flag;
            if(!flag)
             Collections.reverse(temp);
            for(int j =0;j<temp.size();j++)
            {
                ans.add(temp.get(j));
            }
        }
      return ans;
        
    }
}
