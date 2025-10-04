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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode realHead = new ListNode(0);
        ListNode  current = realHead;

        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int x = (l1 != null) ? l1.val : 0; // current value of l1
            int y = (l2 != null) ? l2.val : 0; // current value of l2
            int sum = x + y + carry;
            carry = sum /10;
            int digit = sum% 10;

            current.next = new ListNode(digit);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

        }
        current = reverseList(current);
        
        
        return realHead.next;

        
    }
    static ListNode reverseList(ListNode current){
        
        if(current == null || current.next == null) return current;
        
        ListNode rest = reverseList(current.next);
        
        current.next.next = current;
        
        current.next = null;
        
        return rest;
    }
}