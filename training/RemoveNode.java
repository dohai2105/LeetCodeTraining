import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode nNode = head;
        List<ListNode> lnList = new ArrayList<>();
        while(true){
            ListNode dumpNode = nNode;
            lnList.add(dumpNode);
            if(nNode.next==null) break;
            nNode = nNode.next;
        }
        int length = lnList.size();
        if(length == 0 || length == 1){
            return null;
        } else if(lnList.size() == n){
            head = head.next;
        } else if(n == 1) {
            lnList.get(lnList.size()-n-1).next = null;
        } else {
            lnList.get(lnList.size()-n-1).next = lnList.get(lnList.size()-n+1);
        }
        return head;
    }
}