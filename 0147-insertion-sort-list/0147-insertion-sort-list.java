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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;

        // Step 1: Find the middle of the list
        ListNode mid = findmid(head);
        ListNode rightHead = mid.next;
        mid.next = null; 

        // Step 2: Recursively sort the left and right halves
        ListNode left = insertionSortList(head);
        ListNode right = insertionSortList(rightHead);

        // Step 3: Merge the sorted halves
        return merge(left, right);
    }
    public ListNode findmid(ListNode head){
        if(head==null) return head;

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast =fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(l1 != null && l2 != null){
            if(l1.val<l2.val){
                tail.next =l1;
                l1= l1.next;
            }
            else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if(l1!=null) tail.next = l1;
        if(l2!=null) tail.next = l2;
        return dummy.next;
    }
}