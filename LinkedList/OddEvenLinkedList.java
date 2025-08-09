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

//leetcode ques no 328
https://leetcode.com/problems/odd-even-linked-list/?envType=problem-list-v2&envId=linked-list

class Solution {

    // this almost my logic little bit of change with the help of chatgpt
    
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode oddTail = oddHead;
        ListNode evenTail = evenHead;
        
        while (evenTail != null && evenTail.next != null) {
            oddTail.next = evenTail.next;
            oddTail = oddTail.next;
            
            evenTail.next = oddTail.next;
            evenTail = evenTail.next;
        }
        
        oddTail.next = evenHead; // connect odd list with even list
        return head;
    }
}
