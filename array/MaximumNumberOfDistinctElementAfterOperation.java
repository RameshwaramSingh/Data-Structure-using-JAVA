// leetcode ques no 3397
https://leetcode.com/problems/maximum-number-of-distinct-elements-after-operations/description/?envType=daily-question&envId=2025-10-18

class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        long lastUsed = Long.MIN_VALUE;  // To track the last chosen distinct number

        for (int num : nums) {
            long smallestPossible = Math.max(num - k, lastUsed + 1);
            long largestPossible = num + k;

            if (smallestPossible <= largestPossible) {
                ans++;
                lastUsed = smallestPossible;  // occupy the smallest possible distinct slot
            }
        }
        return ans;
    }
}
