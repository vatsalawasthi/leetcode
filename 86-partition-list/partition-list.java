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
    public ListNode partition(ListNode head, int x) {
        ListNode ans = new ListNode(-1);
        ListNode tail = ans;

        ListNode f = head;
        while(f!=null){
            if(f.val < x){
                tail.next = new ListNode(f.val);
                tail = tail.next;
            }
            f = f.next;
        }
        f = head;
        while(f!=null){
            if (f.val >= x) {
                tail.next = new ListNode(f.val); 
                tail = tail.next;
            }
            f = f.next;
        }
        return ans.next;
    }
}