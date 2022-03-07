public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode tempHead = dummy;
        while(list1 != null && list2 !=null){
            if(list1.val < list2.val){
                tempHead.next = list1;
                list1 = list1.next;
            }else{
                tempHead.next = list2;
                list2 = list2.next;
            }
            tempHead = tempHead.next;
        }
        while(list1 != null){
            tempHead.next = list1;
            list1 = list1.next;
            tempHead = tempHead.next;
        }
        while(list2 != null){
            tempHead.next = list2;
            list2 = list2.next;
            tempHead = tempHead.next;
        }
        tempHead.next = null;
        return dummy.next;
    }
}
