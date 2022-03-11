public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        ListNode currentNode = answer;
        int carry = 0;
        while(l1 != null || l2 != null)
        {
            int n1 = (l1==null)?0:l1.val;
            int n2 = (l2==null)?0:l2.val;
            int temp = n1 + n2 + carry;
            carry = temp/10;
            l1 = (l1==null)?l1:l1.next;
            l2 = (l2==null)?l2:l2.next;
            currentNode.val = temp%10;
            if(l1 !=null || l2 !=null || carry != 0)
            {

                currentNode.next = new ListNode();
                currentNode = currentNode.next;
            }


        }
        if(carry != 0)
        {
            currentNode.val = carry;
        }
        return answer;


    }
}
