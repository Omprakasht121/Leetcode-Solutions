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
    public ListNode doubleIt(ListNode head) {
        if(head == null) return head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }
        int carry = 0;
        ListNode dummy = null;
        while(prev!=null){
            int x = prev.val;
            int num = x *2 + carry;
            int digit = num %10;
            ListNode temp = new ListNode(digit);
            if(dummy == null){
                dummy =temp;
            }
            else{
                temp.next = dummy;
                dummy =temp;
            }
            carry =num/10;
            prev = prev.next;
        }
        if(carry != 0){
            ListNode temp = new ListNode(carry);
            temp.next = dummy;
            dummy = temp;
        }
        return dummy;
       
    }
}