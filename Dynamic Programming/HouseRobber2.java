// leetcode 213
https://leetcode.com/problems/house-robber-ii/description/


class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        // exclude last
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int case1 = memo(nums, 0, n - 2, dp1);

        // exclude first
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int case2 = memo(nums, 1, n - 1, dp2);

        return Math.max(case1, case2);
    }

    private int memo(int[] nums, int index, int end, int[] dp) {
        if (index > end) return 0;
        if (dp[index] != -1) return dp[index];

        int pick = nums[index] + memo(nums, index + 2, end, dp);
        int skip = memo(nums, index + 1, end, dp);

        return dp[index] = Math.max(pick, skip);
    }
}


// using tabulation method

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        
        // case 1: exclude last
        int case1 = robLinear(nums, 0, n - 2);
        // case 2: exclude first
        int case2 = robLinear(nums, 1, n - 1);
        
        return Math.max(case1, case2);
    }
    
    private int robLinear(int[] nums, int start, int end) {
        int prev2 = 0, prev1 = 0;
        for (int i = start; i <= end; i++) {
            int pick = nums[i] + prev2;
            int notPick = prev1;
            int curr = Math.max(pick, notPick);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
