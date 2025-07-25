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

https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/
 //this is my code
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode t = head;
        int len = 0;
        while(t!=null){
            len++;
            t = t.next;
        }
        len = len-k;
        ListNode first = head;
        ListNode second = head;
        for(int i = 1;i<k;i++){
            first = first.next;
        }
        for(int i = 1;i<=len;i++){
            second = second.next;
        }
        ListNode temp = new ListNode(first.val);
        first.val = second.val;
        second.val = temp.val;
        return head;
    }
}
