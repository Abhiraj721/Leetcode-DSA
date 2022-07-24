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
    public ListNode swapPairs(ListNode head) {
        ListNode prev=new ListNode(-1);
            prev.next=head;
            ListNode temp=prev;
            while(temp.next!=null && temp.next.next!=null){
                    ListNode n1=temp.next;
                    ListNode n2=temp.next.next;
                    n1.next=n2.next;
                    temp.next=n2;
                    temp.next.next=n1;
                    temp=temp.next.next;
            }
            return prev.next;
    }
}