class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        if(head1==null)
         return head2;
        if(head2==null)
         return head1;
        Node dummy = new Node(-1);
        Node curr = dummy;
        Node front = null;
        while(head1!=null && head2!=null)
        {
            if(head1.data<head2.data)
            {
              front = head1.next;
              curr.next = head1;
              curr = curr.next;
              head1 = front;
            }
            else
            {
                front = head2.next;
              curr.next = head2;
              curr = curr.next;
              head2 = front;
            }
        }
        if(head1!=null)
        {
            curr.next = head1;
        }
        if(head2!=null)
          curr.next = head2;

          return dummy.next;
    }
}
