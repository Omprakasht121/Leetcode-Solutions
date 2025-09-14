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
        if(head==null) return head;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        ListNode dummy = new ListNode(0);
        ListNode curr =head;
        dummy.next =head;
        head=dummy;
        ListNode prev = head;
        while(curr!=null){
           if(set.contains(curr.val)){
                prev.next =curr.next;
           }
           else{
            prev=prev.next;
           }
           curr = curr.next;
        }
        prev.next = curr;
        return head.next;
    }
}