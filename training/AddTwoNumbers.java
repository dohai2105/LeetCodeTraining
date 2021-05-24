

// https://leetcode.com/problems/add-two-numbers/

public class AddTwoNumbers {
    
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int total = l1.val + l2.val;
        int plus = total >= 10 ? 1 : 0;
        ListNode resultListNode = new ListNode(total%10);
        ListNode tmp = resultListNode;
        while (true) {
            if(l1.next == null && l2.next == null && plus == 0) {
                break;
            }
            ListNode nextListNode1 = l1.next == null ? new ListNode(0) : l1.next;
            ListNode nextListNode2 = l2.next == null ? new ListNode(0) : l2.next;
            total = nextListNode1.val + nextListNode2.val + plus;
            plus = total >= 10 ? 1 : 0;
            ListNode nextResultListNode = new ListNode(total%10);
            tmp.next = nextResultListNode;
            tmp = nextResultListNode;

            if(l1.next == null && l2.next == null) {
                break;
            }
            l1 = nextListNode1;
            l2 = nextListNode2; 
        }
        return resultListNode;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);

 
        ListNode result = addTwoNumbers(l1, l2);
        System.out.println(result);
    }
    
}
