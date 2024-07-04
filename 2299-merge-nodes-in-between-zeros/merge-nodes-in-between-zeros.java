class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode t = new ListNode(), curr = t;
        head = head.next;
        int sum = 0;
        while(head != null) {
            if(head.val == 0) {
                curr.next = new ListNode(sum);
                curr = curr.next;
                sum = 0;
            } 
            sum += head.val;
            head = head.next;
        }
        return t.next;
    }
}