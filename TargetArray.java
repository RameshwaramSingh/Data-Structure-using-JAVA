package com.priyanshu;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>arr = new ArrayList<Integer>();
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr.add(index[i],nums[i]);
        }
        for(int i = 0; i<arr.size(); i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }


    public static void main(String[] args) {
        TargetArray obj = new TargetArray();
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = obj.createTargetArray(nums,index);
        System.out.println(" ans "+Arrays.toString(ans));
    }
}
