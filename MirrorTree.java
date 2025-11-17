class Solution {
    void mirror(Node root) {
     if(root==null)
        return ;
    final Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty())
    {
        final Node node = queue.poll();

        final Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        if(node.left!=null)
         queue.add(node.left);
        if(node.right!=null)
         queue.add(node.right);

    }
        return ;
    }
}
