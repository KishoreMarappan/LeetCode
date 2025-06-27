class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode t = new ListNode(0) ;
        ListNode c = t;
        t.next = head;
        while(c.next != null ){
            if(c.next.val == val) c.next = c.next.next;
            else c = c.next;
        }
        return t.next;
    }
    
}