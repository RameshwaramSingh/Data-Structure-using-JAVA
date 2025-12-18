package com.priyanshu;

import java.util.Arrays;

public class Sum_1d_array {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        for(int i = 1; i<len; i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        Sum_1d_array obj = new Sum_1d_array();
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(obj.runningSum(nums)));
    }
}

