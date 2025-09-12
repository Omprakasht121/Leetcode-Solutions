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
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode curr =l1;
        ListNode first = null;
        ListNode next;
        while(curr!=null){
            next = curr.next;
            curr.next = first;
            first = curr;
            curr =next;
        }
        curr = l2;
        ListNode second = null;
         while(curr!=null){
            next = curr.next;
            curr.next = second;
            second = curr;
            curr =next;
        }
        int carry =0;
        ListNode dummy = new ListNode(0);
        curr = dummy;
        while(first!=null && second!=null){
            int sum = first.val + second.val + carry;
            ListNode temp = new ListNode(sum%10);
            curr.next = temp;
            curr = curr.next;
            carry = sum/10;
            first = first.next;
            second = second.next;
        }
        while(first!=null){
            int sum = first.val + carry;
            ListNode temp = new ListNode(sum%10);
            curr.next = temp;
            curr = curr.next;
            carry = sum/10;
            first = first.next;
        }
        while(second!=null){
            int sum =  second.val + carry;
            ListNode temp = new ListNode(sum%10);
            curr.next = temp;
            curr = curr.next;
            carry = sum/10;
            second = second.next;
        }
        if(carry != 0){
            ListNode temp = new ListNode(carry);
            curr.next =temp;
        }
        
        curr = dummy.next;
        ListNode prev =null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }
        return prev;
    }
}