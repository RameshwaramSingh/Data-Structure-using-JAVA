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

//leetcode ques no 19

class Solution {

// this is my code this is totally solved by me

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        temp = head;
        int pos = size-n;
        if(pos==0){
            head= temp.next;
        }
        for(int i =0;i<pos-1;i++){
            temp = temp.next;
        }
        if(temp.next.next==null){
                temp.next = null;
            }
            else{
            temp.next = temp.next.next;
            }
            return head;
    }
}
