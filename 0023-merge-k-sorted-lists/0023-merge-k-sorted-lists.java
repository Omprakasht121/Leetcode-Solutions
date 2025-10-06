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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length ==1) return lists[0];
         ListNode first = lists[0];
         for(int i=1;i<lists.length;i++){
            ListNode second = lists[i];
            ListNode head = new ListNode(0);
            ListNode temp = head;
            
            while(first!=null && second!=null){
                if(first.val<=second.val){
                    temp.next=first;
                    first= first.next;
                   
                }
                else{
                    
                    temp.next=second;
                    second= second.next;
                   
                }
                temp = temp.next;
            }
            if(first!=null){
                temp.next = first;
            }
            if(second!=null){
                temp.next = second;
            }
            first = head.next;
         }
         return first;
    }
}