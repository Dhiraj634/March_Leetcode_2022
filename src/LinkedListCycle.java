public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode slow = head, fast = head.next;
        while(slow != null && fast!= null && slow != fast){
            slow = slow.next;
            fast = fast.next == null ? null : fast.next.next;
        }

        return slow == fast && slow!=null;
    }
}
