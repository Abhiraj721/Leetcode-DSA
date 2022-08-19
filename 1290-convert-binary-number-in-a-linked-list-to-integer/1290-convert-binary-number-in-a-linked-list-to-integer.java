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
    public int getDecimalValue(ListNode head) {
   int a=0;
            ListNode curr=reverse(head);
            int sum=0;
            while(curr!=null){
                 sum+=curr.val*Math.pow(2,a++);
                    curr=curr.next;
;            }
            return sum;
    }
        public ListNode reverse(ListNode head){
                ListNode prev=null;

                while(head!=null){
                        ListNode next=head.next;
                        head.next=prev;
                        prev=head;
                        head=next;
                        
                }
                return prev;
        }
}