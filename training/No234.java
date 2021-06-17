import java.util.ArrayList;

public class No234 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // public static boolean isPalindrome(ListNode head) {
    //     if (head == null || head.next == null) return true;
    //     ArrayList<Integer> persistList = new ArrayList<>();
    //     int mapFirstVal = Integer.MAX_VALUE;
    //     int mapSecondVal = Integer.MAX_VALUE;
    //     // iterate through half amount of nodes starting from left
    //     boolean isOdd = false;
    //     while(head != null) {
    //         if(lastFirstVal == head.val){
    //             isOdd = false;
    //             break;
    //         }
    //         if(lastSecondVal == head.val){
    //             isOdd = true;
    //             break;
    //         }
    //         lastSecondVal = lastFirstVal;
    //         lastFirstVal = head.val;
    //         persistList.add(head.val);
    //         head = head.next;
    //     }
    //     // iterate through remain half amount of nodes starting from middle
    //     int j = isOdd ? persistList.size() - 2 : persistList.size() - 1;

    //     while(head != null && j >= 0) {
    //         if((int)persistList.get(j) != head.val){
    //             return false;
    //         }
    //         j--;
    //         head = head.next;
    //     }

    //     if(head != null || j >= 0) {
    //         return false;
    //     }
    //     return true;
    // }

    public static boolean isPalindrome(ListNode head) {
        if (head.next == null) return true;
        ListNode jumpDoubleStepNode = head;
        ListNode halftLeftNode = head;
        ListNode preNode = null; 

        while (jumpDoubleStepNode != null && jumpDoubleStepNode.next != null){
            jumpDoubleStepNode = jumpDoubleStepNode.next.next;
            ListNode tempNextNode = halftLeftNode.next;
            halftLeftNode.next = preNode;
            preNode = halftLeftNode;
            halftLeftNode = tempNextNode;
        }
        ListNode halftRighNode = preNode;

        if(jumpDoubleStepNode != null) {
            halftLeftNode = halftLeftNode.next;
        }

        while (halftRighNode != null || halftLeftNode != null) {
            if(halftLeftNode == null || halftRighNode == null || halftLeftNode.val != halftRighNode.val) {
                return false;
            }
            halftRighNode = halftRighNode.next;
            halftLeftNode = halftLeftNode.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode A = new ListNode(1);
        ListNode B = new ListNode(0, A);
                ListNode C = new ListNode(1, B);
            ListNode C1 = new ListNode(1, C);

               ListNode D = new ListNode(1, C1);
        isPalindrome(C);
    }
}
