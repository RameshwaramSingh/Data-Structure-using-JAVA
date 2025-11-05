package com.priyanshu;

import java.util.Arrays;

public class ReverseSubArray {
    void reverseSubArray(int arr[], int n, int l, int r) {
            // code here
            l--;
            r--;
            while(l<r)
            {
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        ReverseSubArray obj = new ReverseSubArray();
        int[] arr = {1,2,3,4,5,6,7};
        obj.reverseSubArray(arr,7,2,4);
    }
}

