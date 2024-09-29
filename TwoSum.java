package com.priyanshu;

import java.util.Arrays;

/*
1. Two Sum
        Easy
        Topics
        Companies
        Hint
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.

        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] result = new int [len];
        for (int i=0; i<len-1; i++){
            for(int j= i + 1; j<len;j++){
                if(nums[i] + nums[j] == target){
                    result = new int[]{i,j};
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] nums = {3,2,3};
        int[] finalResult = obj.twoSum(nums,6);
        System.out.println(Arrays.toString(finalResult));
    }
}
