package com.priyanshu.array;
import java.util.*;
public class Sum2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        Arrays.sort(arr);
        pair(arr,target);
    }
    static void pair(int arr[], int target){
        List<List<Integer>> res = new ArrayList<>();
        int l =0;
        int r = arr.length-1;
        while(l<r){
            // to avoid duplicate element
            if(l>0&& arr[l] == arr[l-1]){
                l++;
                continue;
            }
            if(r<arr.length-1 && arr[r] == arr[r+1]){
                r--;
                continue;
            }
            if(arr[l]+arr[r] == target){
                res.add(Arrays.asList(arr[l],arr[r]));
                l++;
                r--;
            }
            else if(arr[l] +arr[r]> target){
                r--;
            }
            else{
                l++;
            }
        }
        System.out.println(res);
    }
}
