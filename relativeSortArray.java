package com.priyanshu;

import java.util.Arrays;
// ques no 1122 leetcode
//https://leetcode.com/problems/relative-sort-array/description/
public class relativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }
    static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int j=0;
        int count =0;
        int ans[] = new int[arr1.length];
        Arrays.sort(arr1);
        while(j<arr2.length){
            for(int i =0; i<arr1.length; i++){
                if(arr1[i] == arr2[j]){
                    ans[count] = arr1[i];
                    count++;
                    arr1[i] = -1;
                }
            }
            j++;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                ans[count] = arr1[i];
                count++;
            }
        }
        return ans;
    }
}
