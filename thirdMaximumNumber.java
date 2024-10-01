package com.priyanshu;
import java.util.Arrays;
public class thirdMaximumNumber {
    public static void main(String[] args){
        int[] arr = {2,5,4,7,7,8,8};
        thirdMax(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int thirdMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 1;
        for(int i = n-1; i>0; i--){
            if(nums[i]!= nums[i-1]){
                count++;
            }
            if(count==3){
                return nums[i-1];
            }
        }
        System.out.println(nums[n-1]);
        return nums[n-1];
    }
}
