package com.priyanshu;

import java.util.Arrays;

public class sortArrayByParity {
    static int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int count = 0;
        for(int i=0; i<len; i++){
            if(nums[i]%2 == 0){
                ans[count] = nums[i];
                count++;
            }
        }
        for(int i=0; i<len; i++){
            if(nums[i]%2 == 1){
                ans[count] = nums[i];
                count++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr ={3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
}

