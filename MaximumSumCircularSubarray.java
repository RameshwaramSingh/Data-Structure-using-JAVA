class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int maxSum = nums[0];//this is used to calculate maximum sum
        int minSum = nums[0];//this is used to calculte minimum sum
        int curMax = 0;
        int curMin = 0;
        for(int n : nums){
            curMax = Math.max(curMax + n, n);
            maxSum = Math.max(maxSum, curMax);

            curMin = Math.min(curMin + n, n);
            minSum = Math.min(minSum, curMin);
            total = total+n;
        }
        if(maxSum<0){
            return maxSum;//in this case all the values are negative
        }
        return Math.max(maxSum,total-minSum);
    }
}
