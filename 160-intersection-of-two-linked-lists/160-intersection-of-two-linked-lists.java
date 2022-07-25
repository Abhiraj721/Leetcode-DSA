/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer>main=new HashMap<>();
            ListNode curr1=headA;
            ListNode curr2=headB;
            while(curr1!= null){
                    main.put(curr1,2);
                    curr1=curr1.next;
            }
            while(curr2!=null){
                    if(main.containsKey(curr2)) {
                            return curr2;
                    }
                    curr2=curr2.next;
            }
            return null;
    }
}