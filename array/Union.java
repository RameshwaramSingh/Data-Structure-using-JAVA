package com.priyanshu.array;
import java.util.*;
public class Union {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 4};
        int[] arr2 = {2, 2, 4, 4};
        union(arr,arr2);
    }
    static void union(int arr[],int arr2[]){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int m = arr.length;
        int n = arr2.length;
        int i =0,j=0;
        while(i<m && j<n){

            // Skip duplicate elements in the first array
            if(i>0 && arr[i-1]==arr[i]){
                i++;
                continue;
            }

            // Skip duplicate elements in the second array
            if(j>0 && arr2[j-1]==arr2[j]){
                j++;
                continue;
            }

            // select and add the smaller element and move
            if(arr[i]<arr2[j]){
                ans.add(arr[i]);
                i++;
            }
            else if(arr[i]>arr2[j]){
                ans.add(arr2[j]);
                j++;
            }

            // If equal, then add to result and move both
            else{
                ans.add(arr[i]);
                i++;
                j++;
            }
        }

        // Add the remaining elements of a[]
        while(i<m){
            if(i>0 && arr[i-1]==arr[i]){
                i++;
                continue;
            }
            ans.add(arr[i]);
            i++;
        }

        // Add the remaining elements of b[]
        while(j<n){

            // Skip duplicate elements in the second array
            if(j>0 && arr2[j-1]==arr2[j]){
                j++;
                continue;
            }
            ans.add(arr2[j]);
            j++;
        }
        System.out.println(ans);
    }
}
