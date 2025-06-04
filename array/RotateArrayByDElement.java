package com.priyanshu.array;
import java.util.*;
public class RotateArrayByDElement {
    static void rotateArr(int arr[],int d){
        int n = arr.length;
        d = d%n; //handle the case where d>n
        int start =0, end = d-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        start = d;
        end = arr.length -1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        start =0;
        end = arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int d =2;
        rotateArr(arr,d);
    }
}
