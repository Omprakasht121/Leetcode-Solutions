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
    public int pairSum(ListNode head) {
        if(head == null ) return 0;
        ListNode slow =head;
        ListNode  fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        ListNode  curr = slow.next;
        slow.next =null;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }
        int max= Integer.MIN_VALUE;
        ListNode first =head;
        ListNode second =prev;
        while(second!=null){
            int twinsum = first.val + second.val;
            max = Math.max(max,twinsum);
            first= first.next;
            second= second.next;
        }
        return max;
    }
}