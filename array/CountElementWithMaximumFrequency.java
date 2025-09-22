// leetcoe ques no 3005
https://leetcode.com/problems/count-elements-with-maximum-frequency/description/?envType=daily-question&envId=2025-09-22


class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int freq = 0;
        
        // Count frequency of each number
        for(int i =0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            freq = Math.max(freq, map.get(nums[i]));
        }
        
        // Count total elements with max frequency
        int count = 0;
        for(int value : map.values()){
            if(value == freq){
                count += value;
            }
        }
        return count;
    }
}
