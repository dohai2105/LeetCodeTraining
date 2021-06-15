public class No160 {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     ListNode cursorNodeA = headA;
    //     ListNode cursorNodeB = headB;
    //     while (cursorNodeA != null) {
    //         cursorNodeB = headB;
    //         while (cursorNodeB != null) {
    //             if (cursorNodeA == cursorNodeB) {
    //                 return cursorNodeA;
    //             }
    //             cursorNodeB = cursorNodeB.next;
    //         }
    //         cursorNodeA = cursorNodeA.next;
    //     }
    //     return null;
    // }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode cursorNodeA = headA;
        ListNode cursorNodeB = headB;
        while(cursorNodeA != cursorNodeB) {
            cursorNodeA = cursorNodeA == null ? headB : cursorNodeA.next;
            cursorNodeB = cursorNodeB == null ? headA : cursorNodeB.next;
        }
        return cursorNodeA;
    }
}
