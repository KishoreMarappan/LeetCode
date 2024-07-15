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
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer>h = new HashSet<>();
        for(int i : nums){
            h.add(i);
        }
        ListNode t = new ListNode();
        ListNode n = t;
        while(head!= null){
            if(!h.contains(head.val)){
                n.next=new ListNode(head.val);
                n=n.next;
            }
            head=head.next;
        }
        return t.next;
    }
}