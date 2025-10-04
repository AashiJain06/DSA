class Solution {
// Input: x = 1,    
// Output: 2 -> 3 -> 1 -> 7
// Explanation: After deleting the node at the 1st position (1-base indexing), the linked list is as
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
     if(head==null)
      return null;
     Node temp = head;
     while(temp.next!=null)
     {
         if(temp.next.data==temp.data)
          temp.next = temp.next.next;
         else
          temp = temp.next;
     }
      return head;  
    }
}
