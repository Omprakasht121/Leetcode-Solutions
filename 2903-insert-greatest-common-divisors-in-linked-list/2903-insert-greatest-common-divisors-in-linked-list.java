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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head ==null || head.next ==null) return head;
        ListNode first = head;
        ListNode second = head.next;
        while(second!=null ){
            int a = first.val;
            int b =second.val;
            while(b!=0){
                int r = a%b;
                a = b;
                b = r;
            }
            ListNode temp = new ListNode(a);
            first.next= temp;
            temp.next = second;
            first = second;
            second= second.next;
        }
        return head;
    }
}