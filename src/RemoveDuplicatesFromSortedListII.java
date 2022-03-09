import java.util.HashMap;

public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        HashMap<Integer,Integer> map= new HashMap<>();
        ListNode curr = head;
        while(curr!=null){
            map.put(curr.val, map.getOrDefault(curr.val,0)+1);
            curr = curr.next;
        }
        ListNode dummy = new ListNode();
        ListNode tempDummy=dummy;
        curr = head;
        while(curr!=null){
            if(map.get(curr.val) == 1){
                tempDummy.next = curr;
                tempDummy = tempDummy.next;
            }

            curr = curr.next;
        }
        tempDummy.next = null;
        return dummy.next;
    }
}
