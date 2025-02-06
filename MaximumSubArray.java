package com.priyanshu.array;
import java.util.*;
public class MaximumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        maximumSubArray(arr);
    }
    static int maximumSubArray(int arr[]){
    int res = Integer.MIN_VALUE;
    for(int i = 0;i<arr.length; i++){
        int curr = 0;
        for(int j=i; j<arr.length;j++){
            curr = curr +arr[j];
            if(curr>res){
                res = curr;
            }
        }
    }
        System.out.println(res);
    return res;
}
}
