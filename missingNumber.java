package com.priyanshu;
import java.util.Arrays;
/*

268. Missing Number

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range
that is missing from the array.



        Example 1:

        Input: nums = [3,0,1]
        Output: 2
        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
        2 is the missing number in the range since it does not appear in nums.
        Example 2:

        Input: nums = [0,1]
        Output: 2
        Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
         2 is the missing number in the range since it does not appear in nums.
        Example 3:

        Input: nums = [9,6,4,2,3,5,7,0,1]
        Output: 8
        Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
        8 is the missing number in the range since it does not appear in nums.
*/
public class missingNumber {
    static int missingNumber(int[] nums) {
        int n= nums.length;
        int ans = 0;
        Arrays.sort(nums);
        for(int i = 0; i<n; i++){
            if(i!=nums[i]){
                ans = i;
                break;
            }
            if(nums[n-1]!=n){
                ans = n;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2};
        missingNumber(arr);
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
}
