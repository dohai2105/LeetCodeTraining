public class No237 {
    public void deleteNode(ListNode node) {
        if (node != null &&  node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
