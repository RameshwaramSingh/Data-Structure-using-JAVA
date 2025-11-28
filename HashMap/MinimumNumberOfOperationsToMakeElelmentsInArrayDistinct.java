// leetcode ques no 3396

class Solution {
    public int minimumOperations(int[] nums) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();

        // Traverse from right to left
        for (int i = nums.length - 1; i >= 0; --i) {
            // If this element already appeared in the suffix,
            // then we must remove prefix [0..i]
            if (!seen.add(nums[i])) {
                // number of elements to remove = i + 1
                // each operation removes 3 elements
                // ceil((i + 1) / 3) = (i + 1 + 2) / 3
                return (i + 1 + 2) / 3;
            }
        }

        // All elements already distinct
        return 0;
    }
}
