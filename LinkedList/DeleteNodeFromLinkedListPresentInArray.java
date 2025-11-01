//leetcode ques no 3217
https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/description/?envType=daily-question&envId=2025-11-01


class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Dummy node to handle head removals easily
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (set.contains(curr.val)) {
                // Remove the current node
                prev.next = curr.next;
            } else {
                // Move prev only if we didn't remove curr
                prev = curr;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}
