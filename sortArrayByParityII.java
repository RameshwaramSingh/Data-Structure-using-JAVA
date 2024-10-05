package com.priyanshu;

import java.util.Arrays;

public class sortArrayByParityII {
    static int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        int x = 0;
        int y = 1;
        int[] ans = new int[len];
        for(int i =0; i<len; i++){
            if(nums[i]%2 == 0){
                ans[x] = nums[i];
                x = x+2;
            }
            else{
                ans[y] = nums[i];
                y = y+2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr ={3,1,2,4};
        // output = {2,1,4,3}
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
}
