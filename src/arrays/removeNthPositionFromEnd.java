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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode  dummy  = new ListNode(0,head);
        ListNode fast  = dummy;
        ListNode slow = dummy;

        if(head.next == null && n == 1) return null;
        
        for(int i = 0; i<n; i++) fast = fast.next;
        
        if(fast.next == null && n ==2){
            slow.next = slow.next.next;
            return fast;    
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}