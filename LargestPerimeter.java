package com.priyanshu;

public class LargestPerimeter {
    static int largestPerimeter(int[] nums) {
        int perimeter =0;
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }
                else{
                    break;
                }
            }
        }
        for(int i = nums.length-1; i>1; i--){
            int l3 = nums[i];
            int l2 = nums[i-1];
            int l1 = nums[i-2];
            if(l3<l1+l2){
                return l1+l2+l3;
            }
        }
        return 0;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,6,3,10,4,2};
        int ans = largestPerimeter(arr);
        System.out.println(ans);
    }
}

