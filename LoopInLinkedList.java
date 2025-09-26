class Solution {
//You are given the head of a singly linked list. You have to determine whether the given linked list contains a loop or not. 
//A loop exists in a linked list if the next pointer of the last node points to any other node in the list (including itself), rather than being null.
    public boolean detectLoop(Node head) {
        // code here
        if(head==null)
         return false;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow)
             return true;
        }
        return false;
    }
}
