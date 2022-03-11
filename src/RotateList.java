public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode fast = head, temp = head;
        int len = 0;
        // Finding Length
        while(temp!=null){
            temp = temp.next;
            ++len;
        }
        k %= len;
        if(k==0)return head;
        for(int i=1;i<=k;i++){
            fast = fast.next;
        }

        ListNode slow = head;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode dummy = new ListNode();
        dummy.next = slow.next;
        slow.next = null;
        fast.next = head;
        return dummy.next;

    }
}
