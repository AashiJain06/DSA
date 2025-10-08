class Solution {
// Given head which is a reference node to a singly-linked list. 
// The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
// Return the decimal value of the number in the linked list.
// The most significant bit is at the head of the linked list.
// Example 1:
// Input: head = [1,0,1]
// Output: 5
// Explanation: (101) in base 2 = (5) in base 10
    public int getDecimalValue(ListNode head) {
        if(head==null)
         return 0;
        ListNode temp = head;
        int n =0;
        while(temp!=null)
        {
            n++;
            temp = temp.next;
        }
        temp = head;
        int sum =0;
        while(temp!=null)
        {
           sum+= temp.val*(int)Math.pow(2,--n);
           temp = temp.next;
        }
        return sum;
    }
}
