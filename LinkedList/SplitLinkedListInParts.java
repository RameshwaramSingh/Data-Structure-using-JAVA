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

https://leetcode.com/problems/split-linked-list-in-parts/description/


class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        ListNode current = head;
        int length = 0;
        while(current!=null){
            length++;
            current = current.next;
        }
        int part = length/k;
        int extra = length%k;

        current = head;

        for(int i =0; i<k;i++){
            result[i] = current;
            int currentPartSize = part + (extra>0 ?1 :0);
            extra--;

            for(int j =0; j<currentPartSize-1;j++){
                if(current!=null){
                    current = current.next;
                }
            }
            if(current!=null){
                ListNode next = current.next;
                current.next = null;
                current = next;
            }
        }
        return result;
    }
}
