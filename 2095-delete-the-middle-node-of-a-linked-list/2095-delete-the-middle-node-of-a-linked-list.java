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
    public ListNode deleteMiddle(ListNode head) {
        ListNode prev=new ListNode (-1);
            prev.next=head;
            ListNode temp=prev;
            ListNode curr=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                    curr=curr.next;
                    temp=temp.next;
                    fast=fast.next.next;
            }
            temp.next=curr.next;
            return prev.next;
    }
}