import java.util.ArrayList;

public class No234 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {
        if (head.next == null) return true;
        ArrayList<Integer> persistList = new ArrayList<>();
        int lastVal = 0;
        // iterate through half amount of nodes starting from left
        while(head != null) {
            if(lastVal == head.val){
                break;
            }
            lastVal = head.val;
            persistList.add(head.val);
            head = head.next;
        }
        // iterate through remain half amount of nodes starting from middle
        int j = persistList.size() - 1;
        while(head != null && j >= 0) {
            if((int)persistList.get(j) == head.val){
                return true;
            }
            j--;
            head = head.next;
        }
        return false;
    }
}
