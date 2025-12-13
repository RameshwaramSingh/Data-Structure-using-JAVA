package com.priyanshu.recursion;

// ROTATED BINARY SEARCH
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,2,0,arr.length-1));
    }
    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid] == target){
            return mid;
        }


        if(arr[s] <= arr[mid]) {                           // case 1 : this means the first half is sorted
            if (target > arr[s] && target < arr[mid]) {
                return search(arr, target, s, mid - 1);
            } else {
                return search(arr, target, mid + 1, e);
            }
        }


            if(target>arr[mid] && target<arr[e]){                  // case 2 : this is used for second half
                return search(arr,target,mid+1,e);
            }
            else{
                return search(arr,target,s,mid-1);
            }
    }
}

