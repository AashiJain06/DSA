class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        if (head == null)
            return head;
        Set<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            if (hs.contains(curr.val)) {
                if (prev == null)
                    head = head.next;
                else
                    prev.next = curr.next;

            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}
