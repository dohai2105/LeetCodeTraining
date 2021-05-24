

//https://leetcode.com/problems/merge-two-sorted-lists/
public class TwoSortedList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode tmpNode = null;
        ListNode newNode = null;

        while(l1 != null || l2 != null) {
            tmpNode = newNode;
            if(l2 == null || l1!=null && l1.val <= l2.val){
                newNode = new ListNode(l1.val);
                l1 = l1.next != null ? l1.next:null;
            } else {
                newNode = new ListNode(l2.val);
                l2 = l2.next != null ? l2.next:null;
            }

            if(tmpNode !=null ){
                tmpNode.next = newNode;
            }
            if(result == null) {
                result = newNode;
            }
        }
        return result;
    }

    public static void main (String args[]){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l2; l2.next = l3;

        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        l4.next = l5; l5.next = l6;

        mergeTwoLists(l1,l4);
    }
}
