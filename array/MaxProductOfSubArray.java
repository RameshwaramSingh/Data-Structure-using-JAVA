package com.priyanshu.array;

public class MaxProductOfSubArray {

    //Brute Force solution with time complexity o(n^2)
    static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cur = 1;
        for(int i =0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                cur = cur*nums[j];
                if(cur>max){
                    max = cur;
                }
            }
            cur = 1;
        }
        return max;
    }

    //optimal Solution with time complexity O(n)

    static int MaxProduct(int[] nums){
        int prefix = 1;
        int suffix = 1;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            if(prefix ==0){
                prefix =1;
            }
            if(suffix ==0){
                suffix =1;
            }
            prefix = prefix*nums[i];                //multiplying the value from forward
            suffix = suffix*nums[nums.length-1-i];  //multiplying the value from backward because the maximum is lie
            max = Math.max(max,Math.max(prefix,suffix));  //between suffix or prefix
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(MaxProduct(nums));
    }
}
