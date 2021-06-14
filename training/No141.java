import java.util.HashSet;

public class No141 {
// Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
   public boolean hasCycle(ListNode head) {
        HashSet<ListNode> listNodes = new HashSet<>();
        ListNode currentNode = head;
        while(currentNode != null){
            if(listNodes.contains(currentNode)){
                return true;
            }
            listNodes.add(currentNode);
            currentNode = currentNode.next;
        }
        return false;
    }
}
