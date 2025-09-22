 public ListNode removeNthFromEnd(ListNode head, int n) {
//Given the head of a linked list, remove the nth node from the end of the list and return its head.
//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]
//Example 2:
//Input: head = [1], n = 1
//Output: []

        if(head==null)
        return null;
        ListNode fast = head;
        for(int i =0;i<n;i++)
        {
            fast = fast.next;
        }
        if(fast==null)
          return head.next;
          ListNode slow = head;
        while(fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next= slow.next.next;
        return head;
        
    }
