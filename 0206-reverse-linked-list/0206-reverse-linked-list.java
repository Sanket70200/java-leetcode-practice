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
    public ListNode reverseList(ListNode head) {
        
// ListNode currNode=head;
// ListNode prev=null;

// while(currNode!=null){
//     ListNode nextNode=currNode.next;
//     currNode.next=prev;
//     prev=currNode;
//     currNode=nextNode;

// }
// return prev;



ListNode curr=head;
ListNode prev=null;

while(curr!=null){
    ListNode nextNode=curr.next;
    curr.next=prev;
    prev=curr;
    curr=nextNode;
}
return prev;
    }
}