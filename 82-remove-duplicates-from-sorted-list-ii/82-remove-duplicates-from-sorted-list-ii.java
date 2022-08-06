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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer>map=new HashMap<>();
           ListNode ptr=head;
            int size=0;
            while(ptr!=null){
                    size++;
                    map.put(ptr.val,map.getOrDefault(ptr.val,0)+1);
                    ptr=ptr.next;
            }
                        ListNode dummy1=new ListNode(-1);
                     ListNode ans=dummy1;
    
            ListNode dummy=new ListNode(-1);
                     dummy.next=head;
            ListNode temp=dummy;
            ptr=head;
            for(int i=1;i<=size && ptr!=null;i++){
                                
                   if(map.get(ptr.val)==1){
                           ListNode n1=new ListNode(ptr.val);
                          ans.next=n1;
                           ans=ans.next;
                   }
                                    

                    ptr=ptr.next;
                    temp=temp.next;

                    
            }
            return dummy1.next;
    }
}