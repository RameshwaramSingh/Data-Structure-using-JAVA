package com.priyanshu;
import java.util.Arrays;

// cyclic sort algorithm is use when the range of array is given in range from 1 to n or 0 to n, [1,n] or [0,n]
public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1; // this is use when arr element start from 1
            //when array is start from 0 then do not use arr[i]-1 condition. correct = arr[i].
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =temp;
    }
}
