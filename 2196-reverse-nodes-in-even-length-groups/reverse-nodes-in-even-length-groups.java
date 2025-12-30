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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode temp = head;
        ListNode grpend = null;
        int count = 1;

        while(temp!=null){
            ListNode grpstart = temp;
            int len = 0;

            while(temp != null && len<count){
                temp = temp.next;
                len++;
            }

            if(len%2==0){
                ListNode prev = temp;
                ListNode curr = grpstart;

                for(int i = 0; i<len; i++){
                    ListNode next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }

                if(grpend!=null){
                    grpend.next = prev;
                }else{
                    head = prev;
                }
                grpend = grpstart;
            }else{
                grpend = grpstart;
                for(int i = 1; i<len; i++){
                    grpend = grpend.next;
                }
            }
            count++;
        }
        return head;
    }
}