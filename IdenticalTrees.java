class Solution {
    public boolean isIdentical(Node p, Node q) {
       if(p==null || q ==null)
        return (p==q);
        
     return (p.data==q.data) && isIdentical(p.left,q.left) && isIdentical(p.right,q.right);   
    }
}
