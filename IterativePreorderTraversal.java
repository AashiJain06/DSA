class Solution {
    ArrayList<Integer> preOrder(Node root) {
       ArrayList<Integer> ans = new ArrayList<>();
       if(root==null)
        return ans;
    Stack<Node> st = new Stack<>();
    st.push(root);
    while(!st.isEmpty())
    {
        root = st.pop();
        ans.add(root.data);
        if(root.right!=null)
         st.push(root.right);
        if(root.left!=null)
         st.push(root.left);
    }
     return ans;   
    }
}
