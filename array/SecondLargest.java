package com.priyanshu.array;

public class SecondLargest {
    static int getSecondLargest(int[] arr) {
    int max = arr[0];
    int currMax = Integer.MIN_VALUE;
    for(int i =1;i<arr.length;i++){
        if(arr[i-1]>currMax){
            currMax = arr[i];
        }
        if(currMax>max){
            int temp = max;
            max = currMax;
            currMax = temp;
        }
    }
    if(currMax==max){
        return -1;
    }
    return currMax;
}

    public static void main(String[] args) {
        int arr[] ={10,5,10};
        System.out.println(getSecondLargest(arr));
    }
}
