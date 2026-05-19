/* Structure of linked list Node
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
} */
class Solution {
    public static void removeLoop(Node head) {
        // code here
        if(head==null)
         return;
        Node slow = head;
        Node fast =head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                slow = head;
                while(slow!=fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                Node temp = slow;
                while(temp.next!=slow)
                {
                    temp = temp.next;
                }
                temp.next = null;
            }
        }
        
    }
}
