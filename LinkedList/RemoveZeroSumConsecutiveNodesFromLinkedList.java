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

//leetcode ques no 1171
https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/description/?envType=problem-list-v2&envId=linked-list

class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        Map<Integer,ListNode> map = new HashMap<>();
        ListNode curr = dummy;
        int prefixSum = 0;

        //first pass store the latest node for each prefix sum
        while(curr!=null){
            prefixSum += curr.val;
            map.put(prefixSum,curr);
            curr = curr.next;
        }

        // second pass: skip zero sum ranges
        prefixSum = 0;
        curr = dummy;
        while(curr!=null){
            prefixSum += curr.val;
            curr.next = map.get(prefixSum).next;
            curr = curr.next;
        }
        return dummy.next;
    }
}
