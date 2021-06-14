public class No155 {


    static class MinStack {
        static class ListNode {
            int val;
            int min;
            ListNode next;
            ListNode(int x, int min, ListNode next) {
                val = x;
                this.min = min;
                this.next = next;
            }
            ListNode(int x, int min ) {
                val = x;
                this.min = min;
            }
        }
        ListNode head;

        /** initialize your data structure here. */
        public MinStack() {

        }
        
        public void push(int val) {
            if(head ==  null) {
                head = new ListNode(val, val);
            } else {
                int minVal = val <= head.val ? head.min : head.min;
                head = new ListNode(val, minVal, head);
            }
        }
        
        public void pop() {
            head = head.next;
        }
        
        public int top() {
            return head.val;
        }
        
        public int getMin() {
            return head.min;
        }
    }
}
