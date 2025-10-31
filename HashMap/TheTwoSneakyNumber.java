// leetcode ques no 3289
https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/description/?envType=daily-question&envId=2025-10-31

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int ans[] = new int[2];
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(map.contains(nums[i])){
                ans[index] = nums[i];
                index++;
            }
            else{
                map.add(nums[i]);
            }
        }
        return ans;
    }
}
