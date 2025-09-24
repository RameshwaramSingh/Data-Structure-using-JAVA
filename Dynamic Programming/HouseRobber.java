// leetcode ques no 198
https://leetcode.com/problems/house-robber/description/

class Solution {
    int dp[];

    public int rob(int[] nums) {
        
        dp = new int[nums.length];
        Arrays.fill(dp, -1);  // initialize dp with -1 meaning "not yet computed"

        return memoization(nums, 0);
    }

    private int memoization(int nums[], int index) {
        // Base case: if index goes out of bounds, no money can be robbed
        if (index >= nums.length) return 0;

        // If already computed, return stored result (avoids recomputation)
        if (dp[index] != -1) return dp[index];

        // Option 1: include current house -> add its money + solve for index+2
        int include = memoization(nums, index + 2) + nums[index];

        // Option 2: exclude current house -> directly solve for index+1
        int exclude = memoization(nums, index + 1);

        // Take the better of the two choices and store it in dp
        dp[index] = Math.max(include, exclude);

        return dp[index];
    }
}
