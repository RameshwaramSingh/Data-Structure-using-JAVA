package com.priyanshu.array;

import java.util.Arrays;

public class RotateArray {
    static void rotate(int[] nums, int k) {
        int ans[] = new int[nums.length];
        int c = 0;
        for(int i = nums.length-k;i<nums.length;i++){
            ans[c] = nums[i];
            c++;
        }
        for(int i =0;i<nums.length-k;i++){
            ans[c] = nums[i];
            c++;
        }
        System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rotate(arr,3);
    }
}
