// leetcode 377
https://leetcode.com/problems/combination-sum-iv/

class Solution {
    public int combinationSum4(int[] nums, int target) {
        Integer dp[] = new Integer[target+1];
        return solveTab(nums,target);
    }

    public int solveMem(int nums[], int target, Integer dp[]){
        if(target == 0) return 1;
        if(target<0) return 0;

        if(dp[target]!=null) return dp[target];

        int ans = 0;

        for(int i = 0;i<nums.length;i++){
            ans += solveMem(nums,target-nums[i],dp);
        }
        dp[target] = ans;
        return ans;
    }

    public int solveTab(int nums[], int target){
        int dp[] = new int[target+1];
        dp[0] = 1; // base case
        for(int i =1;i<=target;i++){
            for(int num: nums){
                if(i>=num){
                    dp[i] += dp[i-num];
                }
            }
        }
        return dp[target];
    }
}
