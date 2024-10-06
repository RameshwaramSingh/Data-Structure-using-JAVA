package com.priyanshu;
import java.util.*;
//https://leetcode.com/problems/3sum/
public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);                             // this function is used to sort the array
        List<List<Integer>> ans_arr = new LinkedList();// this is used to create a list
        for(int i =0; i<nums.length-2; i++){
            if(i==0 || (i>0 && nums[i] != nums[i-1])){
                int left = i+1;            // this is first pointer start from left side of the array
                int right = nums.length-1; // this is the second pointer start from right side of the array
                int sum = 0-nums[i];      // this is a first element of the triplet
                while(left<right){
                    if(nums[left]+nums[right] == sum){
                        ans_arr.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        while(left<right && nums[left] == nums[left+1])left++; //if two  elements are equal {1,1,4,5,6} then go to the next
                        while(left<right && nums[right] == nums[right-1])right--;//if two  elements are equal {1,3,4,5,7,7,8} then go to the next
                        left++;
                        right--;
                    }
                    else if(nums[left]+nums[right]>sum){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }
        }
        return ans_arr;
    }
}
