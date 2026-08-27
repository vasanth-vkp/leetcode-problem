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
        ListNode sl=head;
        ListNode fs=head;
        int i=0;
        if(sl==null || fs.next==null){
            return null;
        }
        while (i<n){
            fs=fs.next;
            i++;
        }
        if(fs==null){
            return head.next;
        }
        while(fs!=null && fs.next!=null){
            sl=sl.next;
            fs=fs.next;
        }
        sl.next=sl.next.next;
        return head;
    }
}