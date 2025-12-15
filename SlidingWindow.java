package com.priyanshu.array;

/*
Sliding window technique is used to find the maximum sum of k consecutive element
if the k is given then it is static sliding window
 */

public class SlidingWindow {
    public static void main(String[] args) {
        int arr[] = {1,8,30,-5,20,7};
        System.out.println(findSum(arr,4));
    }
    static int findSum(int arr[], int k){
        int currSum = 0;
        int maxSum = 0;
        // first find the sum of first k consecutive terms
        for(int i = 0; i<k; i++){
            currSum = currSum +arr[i];
            maxSum = currSum;
        }
        // now we add the next element and subtract the previous element

        for(int i =k; i<arr.length;i++){
            currSum = currSum+arr[i]-arr[i-k];
            if(currSum>maxSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}

