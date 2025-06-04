package com.priyanshu.array;
// only 26 test case passed out of 65
// use two pointer instead of this
public class ContainerWithMostWater {
    static int maxArea(int[] arr) {
    int rightMax = 1;
    int len = arr.length;
    int cur =0;
    for(int i =1;i<=len/2;i++){
        if(arr[cur]<arr[i]){
            cur = i;
        }
       else if(arr[cur]>arr[rightMax]){
            rightMax = cur;
        }
        else if(arr[cur]==arr[rightMax]){
            rightMax = cur;
        }
    }
    int curmax =0;
    int totalmax = Integer.MIN_VALUE;
    int t =0;
    for(int i = len-1;i>rightMax;i--){
        t = i-rightMax;
        if(arr[rightMax]>arr[i]){
            curmax = arr[i]*t;
        }
        else if(arr[rightMax]<arr[i]){
            curmax = arr[rightMax]*t;
        }
        else if(arr[rightMax]==arr[i]){
            curmax = arr[rightMax]*t;
        }
        if(curmax>totalmax){
            totalmax = curmax;
        }
        t=0;
    }
    return totalmax;
}

    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
