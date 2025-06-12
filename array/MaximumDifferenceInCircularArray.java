https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/?envType=daily-question&envId=2025-06-12

class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int diff = Math.abs(nums[0]-nums[nums.length-1]);
        for(int i =1;i<nums.length;i++){
            int currdiff = Math.abs(nums[i-1]-nums[i]);
            if(currdiff>diff){
                diff = currdiff;
            }
        }
        return diff;
    }
}
