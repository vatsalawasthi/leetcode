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
        
        int end = 0;
        ListNode temp = head;
        while(temp!=null){
            end++;
            temp = temp.next;
        }
        if(n == end){
            return head.next;
        }
        temp = head;
        for(int i = 1; i<end-n;i++){
            temp = temp.next;
            }
            temp.next = temp.next.next;

        return head;
    }
}