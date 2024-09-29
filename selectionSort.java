package com.priyanshu;

import java.util.Arrays;

// This is a algorithm of slection sort algorithm
public class selectionSort {
    public static void main(String[] args){
        int[] arr = {6,8,12,56,21,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    // this function is used for swapping
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    // this function is for finding the maximum value at which index
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i<= end; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
