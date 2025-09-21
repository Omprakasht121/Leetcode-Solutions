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
    public ListNode removeNodes(ListNode head) {
        if(head == null || head.next == null) return head;
        Stack<Integer> stack = new Stack<>();
        stack.push(head.val);
        ListNode curr =head.next;
        while(curr != null){
            if(curr.val < stack.peek()){
                stack.push(curr.val);
            }
            else{
                while(!stack.isEmpty() &&stack.peek()<curr.val){
                    stack.pop();
                }
                stack.push(curr.val);
            }
            curr = curr.next;
        }
        ListNode dummy = null;
        while(!stack.isEmpty()){
            ListNode temp = new ListNode(stack.pop());
            if(dummy == null){
                dummy = temp;
            }
            else{
                temp.next = dummy;
                dummy= temp;
            }
        }
        return dummy;
    }
}