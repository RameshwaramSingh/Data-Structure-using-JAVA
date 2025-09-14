// leetcode ques no 287
https://leetcode.com/problems/find-the-duplicate-number/description/

class Solution {
    public int findDuplicate(int[] nums) {
        // Initialize two pointers (slow and fast) starting at index 0
        int slow = 0;
        int fast = 0;

        // Phase 1: Detect the cycle
        // Move slow by 1 step, fast by 2 steps
        // Because numbers are from 1..n, and array size is n+1, there must be a cycle
        do {
            slow = nums[slow];          // move slow pointer 1 step
            fast = nums[nums[fast]];    // move fast pointer 2 steps
        } while (slow != fast);         // loop until they meet (cycle detected)

        // Phase 2: Find the entrance of the cycle (duplicate number)
        slow = 0;                       // reset slow to start of array

        // Move both pointers one step at a time
        // The point where they meet again is the duplicate number
        while (slow != fast) {
            slow = nums[slow];          // move slow 1 step
            fast = nums[fast];          // move fast 1 step
        }

        // Return the duplicate element (cycle entry point)
        return slow;
    }
}
