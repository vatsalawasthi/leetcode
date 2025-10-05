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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode first = list1;
        ListNode prevA = null, afterB = null;
        int index = 0;

        // find node before a and after b
        while (first != null) {
            if (index == a - 1) prevA = first;
            if (index == b) {
                afterB = first.next;
                break;
            }
            first = first.next;
            index++;
        }

        // connect prevA to list2
        prevA.next = list2;

        // find tail of list2
        while (list2.next != null) {
            list2 = list2.next;
        }

        // connect tail of list2 to afterB
        list2.next = afterB;

        return list1;
    }
}
