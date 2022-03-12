public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node tempHead= head;
        while(tempHead != null){
            Node newNode = new Node(tempHead.val);
            Node next = tempHead.next;
            tempHead.next = newNode;
            newNode.next = next;
            tempHead = next;
        }
        tempHead = head;
        Node newHead = head.next;
        while(newHead != null && tempHead!=null){
            newHead.random = tempHead.random == null ? null : tempHead.random.next;
            newHead = newHead.next !=null ? newHead.next.next : null;
            tempHead = tempHead.next.next;
        }
        newHead = head.next;
        Node pointer2 = newHead;
        tempHead = head;
        while(tempHead !=null){
            Node temp = pointer2.next != null ? pointer2.next.next : null;
            tempHead.next = pointer2.next;
            pointer2.next = temp;
            tempHead = tempHead.next;
            pointer2 =pointer2.next;
        }
        return newHead;
    }
}
