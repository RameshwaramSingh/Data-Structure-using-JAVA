package com.priyanshu.array;
import java.util.*;
public class CommonElementInThreeSortedArray {
    public static void main(String[] args) {
        int arr1[] = {5,7,8,12,54,76};
        int arr2[] = {1,5,6,7,8,12,13};
        int arr3[] = {1,2,4,5,6,7,8};
        commonElement(arr1,arr2,arr3,8);
    }
    static void commonElement(int arr1[], int arr2[],int arr3[],int target){
        int i =0, j=0, k=0;
        while(i<arr1.length && j< arr2.length && k<arr3.length){
            if(arr1[i]==target && arr2[j]==target && arr3[k]==target ){
                System.out.println("Target found at index number  "+i+" in array 1 \n"+j+" index number in array 2 \n"+k+" index number in array 3");
                return;
            }
            if(arr1[i]<arr2[j] && arr3[k]<arr2[j]){
                i++;
                k++;
            }
            else if(arr1[i]>arr2[j] && arr1[i]>arr3[k]){
                j++;
                k++;
            }
            else if(arr3[k]>arr1[i] && arr3[k]>arr2[j]){
                i++;
                j++;
            }
            else if(arr2[j]>arr1[i] && arr3[k]>arr1[i]){
                i++;
            }
            else if(arr3[k]>arr2[j] && arr1[i]>arr2[j]){
                j++;
            }
            else if(arr1[i]>arr3[k] && arr2[j]>arr3[k]){
                k++;
            }
            else if(arr1[i] == arr2[j] && arr2[j]== arr3[k]){
                i++;
                j++;
                k++;
            }
            else{
                System.out.println("Element not found");
                return;
            }
        }
    }
}
