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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1); // dummy node
        ListNode tail = ans;

        ListNode f = l1, s = l2;
        int carry = 0;

        while (f != null || s != null) {
            int x = (f != null) ? f.val : 0; // take value if node exists
            int y = (s != null) ? s.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            tail.next = new ListNode(sum % 10); // create new node
            tail = tail.next;

            if (f != null) f = f.next;
            if (s != null) s = s.next;
        }

        if (carry > 0) {
            tail.next = new ListNode(carry);
        }

        return ans.next; // skip dummy
    }
}
