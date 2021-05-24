

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

// https://leetcode.com/problems/merge-k-sorted-lists/

public class MergeSortedLists {
  public ListNode mergeKLists(ListNode[] lists) {

        if(lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, (x,y) -> x.val - y.val);

        for(ListNode item : lists) {
            if(item != null)
                pq.add(item);
        }
        ListNode tmpNode = new ListNode(0);
        ListNode dummyNode = tmpNode;
        while(!pq.isEmpty()) {
            dummyNode.next = pq.poll();
            dummyNode = dummyNode.next;

            if(dummyNode.next != null) {
                pq.add(dummyNode.next);
            }
        }
        return tmpNode.next;
    }
}
//Line 7: error: incompatible types: ListNode[] cannot be converted to List<ListNode> [in __Driver__.java]
