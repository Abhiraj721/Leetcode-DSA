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
        PriorityQueue <Integer>heap=new PriorityQueue<>();
            for(ListNode head:lists){
                    while(head!=null){
                            heap.add(head.val);
                            head=head.next;
                    }
            }
            ListNode dummy=new ListNode(-1);
            ListNode curr=dummy;
            while(!heap.isEmpty()){
                    curr.next=new ListNode (heap.remove());
                   curr=curr.next;
            }
            
            return dummy.next;
    }
}