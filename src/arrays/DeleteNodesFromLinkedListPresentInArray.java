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
import java.util.*;
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // 1) Membership set of values to remove
        HashSet<Integer> ban = new HashSet<>(nums.length*2);
        for(int x:nums) ban.add(x);

        // 2) Dummy guards the head; prev/curr sweep
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy, curr = head;
        while(curr != null){
            if(ban.contains(curr.val)){
                // unlink curr
                prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;        
    }
}