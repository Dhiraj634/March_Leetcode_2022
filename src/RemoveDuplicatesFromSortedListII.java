import java.util.HashMap;

public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode dummy = new ListNode();
        ListNode tempDummy = dummy;
        while(head != null){
            if(head.next != null && head.val == head.next.val){
                while(head.next!=null && head.val == head.next.val){
                    head = head.next;
                }
            }else{
                tempDummy.next = head;
                tempDummy = tempDummy.next;
            }
            head = head.next;
        }
        tempDummy.next = null;
        return dummy.next;
    }
}
