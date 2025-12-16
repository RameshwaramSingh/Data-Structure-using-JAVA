package com.priyanshu;

import java.util.Arrays;

public class SmallerNumberThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] buck = new int[101];

        for(int i=0; i<nums.length; i++) {
            System.out.println(buck[nums[i]]+" ");
            buck[nums[i]] +=1;
        }

        for(int j=1; j<= 100; j++) {
            buck[j] += buck[j-1];
        }

        for(int k=0; k< nums.length; k++) {
            int pos = nums[k];
            nums[k] = pos==0 ? 0 : buck[pos-1];
        }

        return nums;
    }
    public static void main(String[] args){
        SmallerNumberThanCurrent obj = new SmallerNumberThanCurrent();
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(obj.smallerNumbersThanCurrent(nums)));
    }
}

