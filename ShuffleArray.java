package com.priyanshu;

import java.util.Arrays;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        for(int i=0; i<n; i++){
            arr[2*i] = nums[i];
            arr[2*i+1] = nums[i+n];
        }
        return arr;
    }
    public static void main(String[] args){
        ShuffleArray obj = new ShuffleArray();
        int[] num = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(obj.shuffle(num,3)));
    }
}

