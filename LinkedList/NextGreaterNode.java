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

//leetcod eques no 1019

class Solution {
    public int[] nextLargerNodes(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int[] arr = new int[length];
        int count = 0;

        while (head != null) {
            ListNode tail = head.next;
            while (tail != null && tail.val <= head.val) {
                tail = tail.next;
            }
            arr[count++] = (tail != null) ? tail.val : 0;
            head = head.next;
        }

        return arr;
    }
}
