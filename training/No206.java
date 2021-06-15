public class No206 {

// Definition for singly-linked list.

// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]
// 3.next = 4
// 4.next = 5
// >>>>
// 3.next = 2
// 4.next = 3
// 5.next = 4

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode newHeadNode = null;
        while(head != null) {
            ListNode tmpNode = head.next;
            head.next =  newHeadNode;
            newHeadNode = head;
            head = tmpNode;
        }
        return newHeadNode;
    }
}
