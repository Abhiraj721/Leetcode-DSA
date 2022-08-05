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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
            dummy.next=head;
            ListNode ptr=dummy;
            ListNode temp=head;
            if(head.next==null && n==1){
                    head=head.next;
                    return head;
            }
            int size=0;
        while(temp!=null){
                size++;
                temp=temp.next;
        }
            int index=size-n+1;
            temp=head;
            for(int i=1;i<=size;i++){
                    if(i==index){
                            ptr.next=temp.next;
                    }
                    temp=temp.next;
                    ptr=ptr.next;
            }
            return dummy.next;
    }
}