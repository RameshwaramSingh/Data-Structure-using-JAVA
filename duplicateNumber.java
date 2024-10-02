package com.priyanshu;
import java.util.Arrays;
public class duplicateNumber {
    public static void main(String[]args){
        int[] arr = {3,3};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }
    static boolean containsDuplicate(int[] nums) {
        boolean ans = false;
        Arrays.sort(nums);
        for(int i =1; i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                ans = true;
            }
        }
        System.out.println(ans);
        return ans;
    }
}
