class Solution {
    public int getCount(Node head) {
        // code here
        if(head==null)
         return 0;
        int count =0;
        Node temp = head;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
