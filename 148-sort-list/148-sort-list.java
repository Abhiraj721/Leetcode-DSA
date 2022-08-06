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
    public ListNode sortList(ListNode head) {
         int [] arr=new int[500000];
            int index=0;
            ListNode curr=head;
            while(curr!=null){
                    arr[index++]=curr.val;
                    curr=curr.next;
            }
            int [] nums=new int[index];
            for(int i=0;i<index;i++){
                    nums[i]=arr[i];
            }
            Arrays.sort(nums);
            curr=head;
            for(int i=0;i<index;i++){
                    curr.val=nums[i];
                    curr=curr.next;
            }
            return head;
    }
}