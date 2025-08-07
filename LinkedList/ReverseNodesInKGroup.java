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

// leetcode ques no 25
//https://leetcode.com/problems/reverse-nodes-in-k-group/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
    if (head == null) return null;

    ListNode temp = head;
    int count = 0;

    // Check if there are at least k nodes to reverse
    for (int i = 0; i < k; i++) {
        if (temp == null) return head; // Not enough nodes, return head as-is
        temp = temp.next;
    }

    // Reverse first k nodes
    ListNode prev = null;
    ListNode curr = head;
    ListNode next = null;
    count = 0;

    while (count < k && curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        count++;
    }

    // Recurse for the remaining list
    if (next != null) {
        ListNode newHead = reverseKGroup(next, k);
        head.next = newHead;
    }

    return prev; // New head of this reversed segment
}

}
