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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int index = 1;
        int first = -1;
        int prev = -1;
        int minDist = Integer.MAX_VALUE;

        ListNode prevNode = head;
        ListNode curr = head.next;

        while (curr != null && curr.next != null) {
            index++;

            int a = prevNode.val;
            int b = curr.val;
            int c = curr.next.val;

            if ((b > a && b > c) || (b < a && b < c)) {
                if (first == -1) {
                    first = index;
                } else {
                    minDist = Math.min(minDist, index - prev);
                }
                prev = index;
            }

            prevNode = curr;
            curr = curr.next;
        }

        if (first == -1 || prev == first) {
            return new int[]{-1, -1};
        }

        return new int[]{minDist, prev - first};
    }
}
