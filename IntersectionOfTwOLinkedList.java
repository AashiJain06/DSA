public class Solution {
//Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
//If the two linked lists have no intersection at all, return null.
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
          return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1!=temp2)
        {
            temp1= temp1.next;
            temp2= temp2.next;
            if(temp1==temp2)
             return temp1;
            if(temp1==null)
              temp1 = headB;
            if(temp2==null)
              temp2= headA;   
        }
        return temp1;
    }
}
