class Solution {
    public ListNode swapPairs(ListNode head) {
        // Create a dummy node to act as the predecessor of the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;
        
        // Ensure there are at least two nodes left to swap
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = prev.next.next;
            
            // Rewire the links
            first.next = second.next;
            second.next = first;
            prev.next = second;
            
            // Move prev two steps ahead for the next pair
            prev = first;
        }
        
        return dummy.next;
    }
}
