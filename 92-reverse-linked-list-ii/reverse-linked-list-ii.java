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
        
       ListNode dummy=new ListNode();
       dummy.next=head;

       ListNode leftprev=dummy;
       ListNode curr=head;

       for(int i=0;i<left-1;i++){
        leftprev=leftprev.next;
        curr=curr.next;
       }

       ListNode subNode=curr;

       ListNode prev=null;

       for(int i=0;i<right-left+1;i++){
        ListNode nextNode = curr.next;
        curr.next=prev;
        prev=curr;
        curr=nextNode;


        
       }
leftprev.next=prev;
        subNode.next=curr;
       return dummy.next;
    }
}