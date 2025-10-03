class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        if(head==null)
         return 0;
        Node fast = head;
        for(int i =0;i<n;i++)
        {
            fast = fast.next;
        }
        Node slow = head;
        while(fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        int sum =0;
        while(slow!=null)
        {
            sum+=slow.data;
            slow = slow.next;
        }
        return sum;
    }
}
