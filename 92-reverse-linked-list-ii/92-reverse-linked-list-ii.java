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
    public ListNode reverseBetween(ListNode head, int left, int right) {
            if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(-1,head);
            ListNode curr_1=dummy;
            ListNode prev_1=null;
            for(int i=1;i<=left;i++){
                    prev_1=curr_1;
                    curr_1=curr_1.next;
            }
            ListNode prev_2=prev_1;
            ListNode curr_2=curr_1;
            for(int i=left;i<=right;i++){
                    ListNode next_1=curr_2.next;
                    curr_2.next=prev_2;
                    prev_2=curr_2;
                    curr_2=next_1;
            }
            prev_1.next=prev_2;
            curr_1.next=curr_2;
            return dummy.next;
    }
}