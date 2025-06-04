package com.priyanshu.array;
// leetcode ques no 3392
public class CountSubArray {
    static int countSubarrays(int[] arr) {
        int count =0;
        int sum=0;
        int i =0;
        int j = 2;
        while(j<arr.length){
            sum = arr[i]+arr[j];
            sum = sum*2;
            if(sum == arr[i+1]){
                count++;
            }
            sum =0;
            i++;
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {-1,-4,-1,4};
        System.out.println(countSubarrays(arr));
    }
}
